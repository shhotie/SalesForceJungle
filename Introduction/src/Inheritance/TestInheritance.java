package Inheritance;

import polymorphism.Calculation; // 200

public class TestInheritance {
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();

        Cat cat = new Cat(); // object // instance of a class
        cat.meow();
        cat.eat();




    }
}
