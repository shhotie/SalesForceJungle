package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // to avoid data duplicacy
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(fruits.contains("Cherry"));

    }
}
