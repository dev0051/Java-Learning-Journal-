class A
{
    public void show()
    {
        System.out.println("in  a show ");
    }
}


public class AnonymousInnerClass{
    public static void main(String[] args){

        A obj = new A() //hello
        {
            public void show()
            {
                System.out.println("in a show");
            }
        };
        obj.show();
    }
}
