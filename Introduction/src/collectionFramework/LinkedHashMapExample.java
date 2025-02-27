package collectionFramework;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        /*
        Allow null key and values
        Preserve Insertion order
         */
        Map<String, Integer> linkedHashMap = new HashMap<>();
        linkedHashMap.put("Cherry", 30);
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);


        System.out.println(linkedHashMap);

        //Iterate
        for (Map.Entry<String , Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }



    }
}
