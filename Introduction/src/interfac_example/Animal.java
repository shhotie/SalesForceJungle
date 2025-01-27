package interfac_example;

public interface Animal {
    void eat();
    void sound();
    default void defaultMethod() {
        System.out.println("Default method Animal implementation.");
    }
}
