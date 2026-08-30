public class ExceptionThrow {

    public static void main(String[] args){
        int i = 0;
        int j = 0;

        try
        {
            j=18/i;
            if(j==0) throw new ArithmeticException("NO Zeroes Allowed....");
        }
        catch(ArithmeticException e)
        {
            j=18/i;
            System.out.println("Default "+ e);
        }
        catch(Exception e)
        {
            System.out.println("Something wrong"+e);

        }
        System.out.println(j);
        System.out.println("Good bye"); //0000
    }
}