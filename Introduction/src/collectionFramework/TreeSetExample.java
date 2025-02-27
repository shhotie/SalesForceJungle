package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // avoid duplicate + sorted collection(asc by default)
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(80);
        numbers.add(90);
        numbers.add(45);
        numbers.add(68);
        numbers.add(59);

        System.out.println(numbers);

        Set<String> color = new TreeSet<>();

        color.add("Yellow");
        color.add("Pink");
        color.add("Brown");
        color.add("Green");

        System.out.println(color);
    }
}
