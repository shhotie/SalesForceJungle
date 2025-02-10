package array;

public class Tester1 {
    public static void main(String[] args) {
        int arr[] = {33, 3, 4, 5};
        TestArray2.min(arr);
        TestArray2.printArrForEach(new int[]{10,15,26,30});
        int arr2[] = TestArray2.get();
        System.out.println("Returning array");
        for (int i  : arr2){
            System.out.println(i);
        }
    }
}
