class Animal{
    void sound(){
        System.out.println("Animal Sound ");

    }

}
class Dog extends Animal{
    @java.lang.Override
    void sound() {
        System.out.println("Bark ");
    }
}
public class MethodOverriding{
    public static void main(String[] args){
        Dog dog= new Dog();
        dog.sound();
    }
}