class Calc{

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
class AdvCalc extends Calc{

    public int multi(int a, int b){
        return a*b;

    }
    public int div(int a, int b){
        return a/b;
    }
}

public class  Inheritance {
    public static void main(String[] args){

        AdvCalc obj = new AdvCalc();
        int n1= obj.add(1,2);
        int n2=  obj.sub(1,2);
        int n3 = obj.multi(1,2);
        int n4= obj.div(1,2);

        System.out.println("add = "+ n1+ ","+"sub ="+n2+","+"product = "+n3+","+"division ="+n4);
    }
}