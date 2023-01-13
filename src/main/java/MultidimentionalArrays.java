import java.util.Arrays;

public class MultidimentionalArrays {

    public static void main(String[] args) {

        //1D ARRAY

        int[] oneDArray = {1, 3, 4, 5, 6, 7, 8};
        System.out.println("One D array: \n"+ Arrays.toString(oneDArray));
        //Loop through 1D array
//        for(int i=0; i< oneDArray.length; i++){
//
//            System.out.println(oneDArray[i]);
//        }

        //2D ARRAY

        int[][]  twoDArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14}
        };
        System.out.println("Two D arrays: \n" + Arrays.deepToString(twoDArray));

        //Loop through 2D Array

//        for(int i = 0; i< twoDArray.length; i++){
//            for(int j =0; j< twoDArray.length; j++){
//                System.out.println("2D array items are " + twoDArray[i][j]);
//            }
//        }

        //3D ARRAY

        int[][][] threeDArrays = {
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}
                },
                {
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25},
                        {26, 27, 28, 29, 30}
                },
                {
                        {31, 32, 33, 34, 34},
                        {36, 37, 38, 39, 40},
                        {41, 42, 43, 44, 45}
                }
        };
        System.out.println("Three D arrays: \n" + Arrays.deepToString(threeDArrays));

        // 4D Arrays
        int[][][][] fourDArrays = {
                {
                        {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}
                        },
                        {
                                {13, 14, 15, 16},
                                {17, 18, 19, 20},
                                {21, 22, 23, 24}
                        }
                },
                {
                        {
                                {25, 26, 27, 28},
                                {29, 30, 31, 32},
                                {33, 34, 35, 36}
                        },
                        {
                                {37, 38, 39, 40},
                                {41, 42, 43, 44},
                                {45, 46, 47, 48}
                        },
                }
        };

        System.out.println("Four D arrays: \n" + Arrays.deepToString(fourDArrays));



    }
}
