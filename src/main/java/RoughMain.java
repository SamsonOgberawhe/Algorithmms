import java.util.Arrays;

public class RoughMain {
    public static void main(String[] args) {

        int[][] twoDArray= {
                {1, 2, 3, 4, 5 },
                {6, 7, 8, 9, 10 },
                {11, 12, 13, 14, 15}
        };

        for(int i =0; i< twoDArray.length; i++){
            System.out.println("The first arrays are: " + Arrays.toString(twoDArray[i]));
            for(int j =0; j< twoDArray[i].length; j++){
//                System.out.println("The contents are " + twoDArray[i][j]);
            }
        }
        System.out.println("*********************************\n\n");

        int[][][] threeDArrays = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };
        int totalLenght = 0;

        for(int i = 0; i<threeDArrays.length; i++){
//            totalLenght += i;
            for(int j = 0; j< threeDArrays[i].length; j++){
//                totalLenght += j;
                for(int k = 0; k< threeDArrays[i][j].length; k++){
                    totalLenght += k;
//                    System.out.println("The number at " +(i+j+k) + " " + " is: " + threeDArrays[i][j][k]);
//                    totalLenght = threeDArrays.length + threeDArrays[i].length + threeDArrays[j].length;
                }
            }
        }
        System.out.println("Total length is " + totalLenght);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, -6};
        int[] arr2 = {1, 3, 23, 9, 18, -2};
        swap(arr, 2, 6);
        swap(arr2, 0, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(getMax(arr2));
        System.out.println(getMin(arr));
    }
     static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    static int getMax(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    static int getMin(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
