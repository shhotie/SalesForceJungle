import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 2) {
                System.out.print(i + "," + j + " "); // 1,1,1,2, 2,1,2,2
                j++; //2 
            }
            i++; // 2
        }
    }
}


