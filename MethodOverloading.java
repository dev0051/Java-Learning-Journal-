class Calculator{
    int add(int a, int b){
        return a+b;

    }
    double add(double a , double b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a+b+c;
    }
}

public class MethodOverloading{
    public static void main(String[] args){
        var calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(3.2,3.5));
        System.out.println(calculator.add(2,3,5));
    }
}