enum Laptop{
    Mac(90000),Dell(50000),Ideapad(30000),Surface(70000);

    private int price;

    Laptop() {
       System.out.println("On sale " +this+ ": 50% discount");
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enums{
    public static void main(String[] args){

        for(Laptop lap: Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
    }
}