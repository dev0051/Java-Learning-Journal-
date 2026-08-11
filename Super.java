class Employee{

    String name;

    Employee(String name){
        this.name= name;
    }
}
class Developer extends Employee{
    String language;

    Developer(String name , String language){
        super(name);
        this.language= language;
    }
}
public class Super{
    public static void main(String[] args){
        Developer dev= new Developer("dev","java");
        System.out.println(dev.name);
        System.out.println(dev.language);//hi

    }
}