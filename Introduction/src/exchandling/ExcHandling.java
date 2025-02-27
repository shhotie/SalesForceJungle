package exchandling;

public class ExcHandling {

    public static void main(String[] args) {
        dividebyZero();
        try {
            int dividebyZero = 5/0;
            System.out.println(dividebyZero);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exc => " + e.getMessage());
            System.out.println(e.fillInStackTrace());
        } finally {
            int multi = 5*5;
            System.out.println(multi);
            System.out.println("This is finally block");
        }

    }

    public static void dividebyZero() {
        throw new ArithmeticException("Trying to divide by zero");
    }
}
