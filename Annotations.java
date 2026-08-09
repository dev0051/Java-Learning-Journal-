
class Parent{

    public void show(){
        System.out.println("Show in parent class");
    }
}

class child extends Parent{
    @Override
    public void show(){
        System.out.println("show in child class");
    }
}
public class Annotations {

    public static void main(String[] args ){

        child obj = new child();
        obj.show();


    }
}