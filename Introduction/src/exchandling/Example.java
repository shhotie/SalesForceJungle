package exchandling;

public class Example {
    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Underage not allowed");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
