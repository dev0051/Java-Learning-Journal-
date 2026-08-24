<div align="center">

# ☕ Java Learning Journal

### *Code today. Learn today. Repeat tomorrow.*

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=F7A41D&center=true&vCenter=true&width=600&lines=Learning+Java%2C+one+commit+at+a+time;Core+Java+%7C+OOP+%7C+DSA+%7C+Problem+Solving;Building+consistency%2C+not+just+code;Day+by+day%2C+concept+by+concept)](https://git.io/typing-svg)

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Actively%20Learning-brightgreen?style=for-the-badge)
![Consistency](https://img.shields.io/badge/Goal-Daily%20Commits-blueviolet?style=for-the-badge)
![Last Commit](https://img.shields.io/github/last-commit/dev0051/Java-Learning-Journal-?style=for-the-badge&color=informational)

</div>

---

## 📊 Live Progress

*Updates automatically every day and on every push — no manual editing.*

<!--STATS:START-->

| Metric | Value |
|---|---|
| 🔥 Current Streak | **17 days** 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥 |
| 🏆 Longest Streak | **17 days** |
| 📅 Days Journaling | **17** |
| ☕ Java Files Logged | **31** |
| 📦 Total Commits | **66** |
| 🕒 Last Updated | **24 Aug 2026** |

<!--STATS:END-->

---

## 📖 About This Journal

This repository is my **daily Java learning log** — a running record of everything I study, practice, and build while sharpening my software engineering fundamentals. No fluff, just consistent reps: concepts explored, problems solved, and small projects built along the way.

> 🎯 **The rule is simple: show up and commit something, every single day.**

---

## 🔥 Streak & Contribution Tracker

<div align="center">

![GitHub Streak](https://streak-stats.demolab.com/?user=dev0051&theme=radical&hide_border=true&background=0D1117&stroke=F7A41D&ring=F7A41D&fire=FF6B6B&currStreakLabel=F7A41D)

![Dev's GitHub stats](https://github-readme-stats.vercel.app/api?username=dev0051&show_icons=true&theme=radical&hide_border=true&count_private=true&include_all_commits=true)

![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=dev0051&layout=compact&theme=radical&hide_border=true)

</div>

<div align="center">

### 🐍 Contribution Graph — Snake Edition
<img src="https://raw.githubusercontent.com/dev0051/Java-Learning-Journal-/output/github-contribution-grid-snake.svg" alt="Snake animation" /> 

*(One-time setup needed — see [Enabling the Streak Widgets](#-enabling-the-streak-widgets-one-time-setup) below)*

</div>

---

## 🗺️ Topics Covered So Far

| Category | Concepts |
|---|---|
| 🧱 **OOP Fundamentals** | Encapsulation, Inheritance, Method Overloading, Method Overriding, `super` keyword |
| 🔌 **Interfaces & Abstraction** | Interfaces, Annotations, Anonymous Inner Classes |
| ⚡ **Functional Java** | Lambda Expressions, Lambdas with Parameters |
| 🧵 **Multithreading** | Threads, Thread.sleep() concurrency basics |
| 🚨 **Exception Handling** | try/catch, throw, throws, multi-catch blocks |
| 🔢 **Enums** | Custom enum types and usage |
| 🧩 **DSA / Problem Solving** | Array-based problem sets ([`Questions Arrays/`](./Questions%20Arrays)) |

*This table grows as the journal grows — updated as new topics are added.*

---

## 📂 Repository Structure

```
Java-Learning-Journal/
│
├── Questions Arrays/          # DSA practice — array-based problems
│
├── Encapsulation.java         # OOP: data hiding
├── Inheritance.java           # OOP: extending classes
├── MethodOverloading.java     # OOP: compile-time polymorphism
├── MethodOverriding.java      # OOP: runtime polymorphism
├── Super.java                 # OOP: super keyword usage
│
├── Interface.java             # Abstraction via interfaces
├── AnonymousInnerClass.java   # Anonymous classes
├── Annotations.java           # Built-in & custom annotations
│
├── Lambda.java                # Functional interfaces & lambdas
├── Lambdawithpara.java        # Parameterized lambdas
│
├── Threads.java                # Basic multithreading
├── ThreadsWithSleep.java       # Thread timing & sleep()
│
├── ExecptionHandling.java     # Exception basics
├── ExceptionThrow.java        # throw keyword
├── ExceptionThrows.java       # throws keyword
├── ExceptionMulti.java        # multi-catch blocks
│
└── enums.java                  # Enum types
```

---

## 🚀 Why I'm Doing This

- ✅ Build **daily consistency** as a developer habit, not just a skill goal
- ✅ Strengthen **Core Java + OOP + DSA** fundamentals from the ground up
- ✅ Create a **public, timestamped trail** of progress — visible proof of the grind
- ✅ Revisit and refactor old concepts as understanding deepens

---

## ⚙️ How to Add This to Your Repo (one-time, ~2 minutes)

This README self-updates using a small script + GitHub Action. Here's exactly how to wire it up:

1. **Add three files** to your repo, in these exact paths:
   - `README.md` — replace your current one with this file
   - `scripts/update_readme.py` — the script that calculates your streak/stats
   - `.github/workflows/update-readme.yml` — the automation that runs it

2. **Turn on write permissions** for Actions (needed so it can commit the updated README back):
   - Go to your repo → **Settings → Actions → General**
   - Scroll to **Workflow permissions**
   - Select **"Read and write permissions"** → Save

3. **Commit and push all three files** to `main`.

4. **Run it once manually** to confirm it works:
   - Go to the **Actions** tab → **Update Streak & README Stats** → **Run workflow**
   - After ~10 seconds, refresh your repo — the *Live Progress* table will show real numbers (streak, days journaling, commits, files) instead of zeros.

5. **From here it's fully automatic:**
   - Every time you `git push`, it recalculates instantly
   - It also runs on a daily schedule (3:00 AM UTC / 8:30 AM IST), so even on a day you check your repo without pushing, the "Current Streak" number stays accurate — including counting down to 0 if you miss a day, which is the whole point of a streak tracker 😅

---

## 🛠️ Enabling the Streak Widgets (one-time setup)

The stats above pull live from your GitHub username, but the **snake contribution animation** needs a tiny one-time setup:

1. Go to **Settings → Actions → General** in a repo named exactly `dev0051` (your special profile repo), or add this workflow to this repo instead.
2. Create `.github/workflows/snake.yml` with:

```yaml
name: Generate Snake
on:
  schedule:
    - cron: "0 */6 * * *"
  push:
    branches: [ main ]
  workflow_dispatch: {}

jobs:
  generate:
    runs-on: ubuntu-latest
    steps:
      - uses: Platane/snk@v3
        with:
          github_user_name: dev0051
          outputs: |
            dist/github-contribution-grid-snake.svg
            dist/github-contribution-grid-snake-dark.svg?palette=github-dark
      - uses: crazy-max/ghaction-github-pages@v4
        with:
          target_branch: output
          build_dir: dist
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
```

3. Push it, let the Action run once, and the snake SVG above will start animating your real contribution graph automatically. 🐍

---

## 📌 Follow Along

New `.java` files land here as I learn — one topic, one file, one step closer to mastery.

<div align="center">

**⭐ If you're on a similar journey, star this repo and let's grow together.**

![Visitor Count](https://komarev.com/ghpvc/?username=dev0051&label=Repo%20Views&color=orange&style=for-the-badge)

</div>
