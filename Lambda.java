@FunctionalInterface
interface A{
    void show();
}
public class Lambda {

    public static void main(String[] args){

        A obj = ()  -> System.out.println("In show ");  // A lambda replaces the traditional implementation of the functional interface
        obj.show();
    }
}