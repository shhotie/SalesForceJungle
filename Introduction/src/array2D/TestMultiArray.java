package array2D;

public class TestMultiArray {
    public static void main(String[] args) {
        // datatype arrayName [][];
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] =5;
        array[0][2] = 6;
        array[1][0]=10;
        array[1][1] = 1;
        array[1][2]=6;
        array[2][0]= 8;
        array[2][1]= 64;
        array[2][2]= 5;

        int array2 [][] = {{1,5,6}, {10,1,6}, {8,64,5}};

        for(int row =0; row < 3; row++){
            for(int column=0; column < 3; column++){
                System.out.print(array2[row][column] + " ");
            }
            System.out.println();
        }
    }


}
