class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am Dev");

            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
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
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsWithSleep{
    public static void main(String[] args){

        A obj1 = new A();
        B obj2 = new B();


        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        obj1.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
    }
}
