class Human{
    private int age;
    private String name;

    public  int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n){
    name=n;
    }
}
public class Encapsulation {
    public static  void main(String[] args) throws ClassNotFoundException
    {
        Human obj= new Human();
        obj.setAge(30);
        obj.setName("dev");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}