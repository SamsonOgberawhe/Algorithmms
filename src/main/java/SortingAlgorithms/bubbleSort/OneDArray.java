package SortingAlgorithms.bubbleSort;

import java.util.Arrays;

public class OneDArray {

    public static void main(String[] args) {
        int[] array2 = {3, 5, 2, 7, 1, 99, 66, 32};
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        bubbSort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    //Bubble Sort is an in-place sorting algorithm because no new array is created.
    // The time complexity of bubble sort:
    // Best case is O(N). i.e when the algorithm is sorted. Traversal is only done n-i time;
    //Worst case is  O(N2). i.e when the algorithm is sorted in descending order. traversal is done n2 times.

    static void bubbSort(int[] array){
        boolean swapped; // to break out of the loop if the array is sorted already.
        for(int i =0; i< array.length; i++){
            swapped = false;
            for(int j=1; j<array.length -i; j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
 }
