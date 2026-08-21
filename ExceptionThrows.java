class DevException extends Exception {
    public DevException(String string) {
        super(string);
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("calc");
    }
}

public class ExceptionThrows {

    static {
        System.out.println("class load");
    }

    public static void main(String[] args) {

        A obj = new A();

        try {
            obj.show();
        }
        catch (ClassNotFoundException e) { //hello
            e.printStackTrace(); // helloooooooo
        }
    }
}