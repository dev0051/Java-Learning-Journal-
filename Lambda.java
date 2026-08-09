@FunctionalInterface
interface A{
    void show();
}
public class Lambda {

    public static void main(String[] args){

        A obj = ()  -> System.out.println("In show ");  // instead of writing the tarditional way of implementration just write lambda expression
        obj.show();
    }
}