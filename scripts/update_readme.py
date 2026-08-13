"""
Auto-updates the Live Progress section of README.md using real git history.
Run by the GitHub Action on every push and once daily via cron.
No manual editing needed after setup.
"""

import subprocess
import datetime
import re
import os

README_PATH = "README.md"
START_MARK = "<!--STATS:START-->"
END_MARK = "<!--STATS:END-->"


def run(cmd):
    return subprocess.check_output(cmd, shell=True, text=True).strip()


def get_commit_dates():
    raw = run("git log --pretty=format:%ad --date=short")
    if not raw:
        return []
    dates = sorted(set(datetime.datetime.strptime(d, "%Y-%m-%d").date() for d in raw.splitlines()))
    return dates


def current_streak(dates):
    if not dates:
        return 0
    today = datetime.date.today()
    date_set = set(dates)
    # streak counts backward from today (or yesterday if nothing committed yet today)
    anchor = today if today in date_set else today - datetime.timedelta(days=1)
    if anchor not in date_set:
        return 0
    streak = 0
    day = anchor
    while day in date_set:
        streak += 1
        day -= datetime.timedelta(days=1)
    return streak


def longest_streak(dates):
    if not dates:
        return 0
    longest = run_len = 1
    for i in range(1, len(dates)):
        if (dates[i] - dates[i - 1]).days == 1:
            run_len += 1
            longest = max(longest, run_len)
        else:
            run_len = 1
    return longest


def count_java_files():
    try:
        out = run("find . -name '*.java' -not -path './.git/*'")
        return len([l for l in out.splitlines() if l.strip()])
    except subprocess.CalledProcessError:
        return 0


def build_stats_block():
    dates = get_commit_dates()
    total_commits = int(run("git rev-list --count HEAD")) if dates else 0
    java_files = count_java_files()
    days_journaling = (dates[-1] - dates[0]).days + 1 if dates else 0
    streak = current_streak(dates)
    best_streak = longest_streak(dates)
    last_updated = datetime.date.today().strftime("%d %b %Y")
    fire = "🔥" * min(streak, 10) if streak > 0 else "—"

    block = f"""
| Metric | Value |
|---|---|
| 🔥 Current Streak | **{streak} day{"s" if streak != 1 else ""}** {fire} |
| 🏆 Longest Streak | **{best_streak} days** |
| 📅 Days Journaling | **{days_journaling}** |
| ☕ Java Files Logged | **{java_files}** |
| 📦 Total Commits | **{total_commits}** |
| 🕒 Last Updated | **{last_updated}** |
"""
    return block


def update_readme():
    with open(README_PATH, "r", encoding="utf-8") as f:
        content = f.read()

    new_block = build_stats_block()
    pattern = re.compile(re.escape(START_MARK) + r".*?" + re.escape(END_MARK), re.DOTALL)
    replacement = f"{START_MARK}\n{new_block}\n{END_MARK}"

    if pattern.search(content):
        content = pattern.sub(replacement, content)
    else:
        # markers missing, append a Live Progress section near the top
        content = content.replace(
            "## 📖 About This Journal",
            f"## 📊 Live Progress\n\n{replacement}\n\n## 📖 About This Journal",
            1,
        )

    with open(README_PATH, "w", encoding="utf-8") as f:
        f.write(content)


if __name__ == "__main__":
    update_readme()
