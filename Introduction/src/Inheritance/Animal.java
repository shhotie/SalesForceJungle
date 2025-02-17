package Inheritance;

public class Animal {
    int age;
    String color;

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Animal() {

    }

    // parent class
    void eat(){
        System.out.println("Eating");
    }
}
