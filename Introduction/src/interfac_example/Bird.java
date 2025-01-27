package interfac_example;

public interface Bird {
    void fly();
    void sound();
    default void defaultMethod() {
        System.out.println("Default method Bird implementation.");
    }
}
