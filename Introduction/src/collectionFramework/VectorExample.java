package collectionFramework;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> animal = new Vector<>();

        // add element
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Elephant");

        //Access element
        System.out.println(animal.get(0));

        // Iterate
        for (String a : animal){
            System.out.println(a);
        }
    }

}
