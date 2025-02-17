package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListImpll {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        // Add elements to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);

        // Access elements from the list
        int num = list1.get(2);
        System.out.println("num = "+num);
        System.out.println("get element from index 2 = " + list1.get(2));

        // Removing element
        System.out.println("Removing elemtnt =" + list1.remove(2));
        System.out.println("List after removing" + list1);
    }
}
