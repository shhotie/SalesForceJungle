package interfac_example;

public class Bat implements Animal, Bird{
    @Override
    public void eat() {
        System.out.println("The bat is eating insects");
    }

// Single implementation for common method in interfaces Animal and bird
    @Override
    public void sound() {
        System.out.println("The bat is making chirping sound");
    }

    @Override
    public void defaultMethod() {
        Animal.super.defaultMethod();
        Bird.super.defaultMethod();
        System.out.println("Bat overrides both the default methods");
    }

    @Override
    public void fly() {
        System.out.println("The bat is flying in night");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.defaultMethod();
//        bat.eat();
//        bat.fly();
//        Animal animal = new Bat();
//        animal.eat();
//        animal.sound();
//
//        Bird bird = new Bat();
//        bird.fly();
//        bird.sound();
    }
}
