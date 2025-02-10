package array;

public class Tester {
    public static void main(String[] args) {
        // Pattern 1
        // declaration + instantiation
        int arr [] = new int[5];
        // initialize
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        arr[5] = 60;

       for(int i =0; i < arr.length; i++){
           System.out.println(arr[i]);
       }

       // Pattern 2
        int [] arr2 = {33, 3, 4, 5};
        System.out.println("Printing arr2 length = " +arr2.length);

        System.out.print("Print arr2 = ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
        System.out.println("for-each loop");
        /*
         for(datatype variable : array){
         [body]
            }
        */
        for (int i : arr2){
            System.out.println(i);
        }

    }
}
