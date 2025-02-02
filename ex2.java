class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ex2 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
