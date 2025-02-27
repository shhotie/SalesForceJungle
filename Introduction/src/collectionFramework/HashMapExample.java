package collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        /*
        Allow null key and null value
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println(map);
        System.out.println("Access a value by key" + map.get("Cherry"));
        System.out.println("contains Banana? " + map.containsKey("Banana"));
        // Remove a key value pair
        map.remove("Cherry");
        System.out.println(map);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
