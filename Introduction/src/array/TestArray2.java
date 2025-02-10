package array;

public class TestArray2 {
    static void min(int arr[]){
        int min = arr[0];
        for(int i=1 ; i < arr.length; i++ ){
            if(min > arr[i]){ //33 > 3
                min = arr[i];
            }
        }
        System.out.println("Minimum value is = " + min);
    }


    public static void printArray(int arr[]){
        for(int i =0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void printArrForEach(int arr[]){
        System.out.println("printed via for each loop");
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int[] get(){
        return new int[] {10,20,30};
    }
}
