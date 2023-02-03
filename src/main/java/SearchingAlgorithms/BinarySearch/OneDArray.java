package SearchingAlgorithms.BinarySearch;


import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 3));
    }

    private static int binarySearch(int[] array, int target) {

        if(array.length == 0){
            return -1;
        }
        int start = 0;
        int end = array.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < array[mid]){
                end = mid -1;
            }
           else if(target > array[mid]){
                start = mid + 1;
            } else{
               return mid;
            }
        }
        return -1;
    }

}
