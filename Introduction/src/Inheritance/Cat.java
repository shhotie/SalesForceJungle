package Inheritance;

public class Cat extends Animal{
    public Cat(String color, int age) {
        super(color, age);
    }

    public Cat() {
        super();
    }

    void meow(){
        System.out.println("Meowing");
    }
}
