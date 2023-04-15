public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Ekahne");// This will not be executed
        }
        catch (ArithmeticException e) {
            //Catch divide by zero error
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement.");//this wll be executed
    }
}
