interface Computer
{
    void code();

}
class laptop implements Computer
{
    public void code(){
        System.out.println("code , compile , run......");
    }
}
class Desktop implements Computer
{
    public void code(){
        System.out.println("code but faster .....");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Interface{
    public static void main(String[] args){

        Computer lap = new laptop();
        Computer desk = new Desktop();

        Developer Dev = new Developer();

        Dev.devApp(desk);
    }
}