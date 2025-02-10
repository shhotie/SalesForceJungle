package array2D;

public class JaggedArray {
    public static void main(String[] args) {
        // Declaration of jagged array
        int [][] arr = new int[3][];

        // initializing rows with different column size
        arr[0] = new int[3];
        arr[1]= new int[4];
        arr[2]= new int[2];

        // initialization of jagged array
        int count = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                arr[i][j]= count++;
            }
        }

        // printing jagged array
        for(int i= 0; i < arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
