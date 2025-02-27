package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLClass {
    public static void main(String[] args) {
//        List<String> colors = new LinkedList<>();
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("List of colors = " + colors);

        //add element in the begining
        colors.add(1, "Yellow");
        colors.addFirst("Voilet");
        colors.addLast("Black");
        System.out.println("List of colors = " + colors);

        colors.get(3);
        System.out.println("Element at 0th index = " + colors.get(0));

        System.out.println("Access first color = "+ colors.getFirst());
        System.out.println("Access last color = " + colors.getLast());

        System.out.println("Remove first color = " + colors.removeFirst());
        System.out.println("Remove last color = " + colors.removeLast());
        System.out.println("List of colors = " + colors);
        System.out.println("Remove 1th index color = " + colors.remove(1));
        System.out.println("List of colors = " + colors);





    }
}
