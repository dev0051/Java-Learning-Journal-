class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am Dev");
        }
    }
}
class B extends Thread
    {
        public void run()
        {
            for(int i =0;i<=10;i++)
            {
                System.out.println("how are you ");
            }
        }
    }

    public class Threads{
        public static void main(String[] args){

            A obj1 = new A();
            B obj2 = new B();

            obj1.start();
            obj2.start();
        }
    }
