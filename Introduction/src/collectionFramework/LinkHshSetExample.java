package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHshSetExample {
    public static void main(String[] args) {
        // avoid data duplicate + ordered collection
        Set<String> color = new LinkedHashSet<>();

        color.add("Yellow");
        color.add("Pink");
        color.add("Brown");
        color.add("Green");

        for(String obj : color){
            System.out.println(obj);
        }
    }
}
