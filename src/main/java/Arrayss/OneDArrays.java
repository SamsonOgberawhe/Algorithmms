package Arrayss;

import java.util.Arrays;
import java.util.Collections;

public class OneDArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, -6};
        int[] arr2 = {1, 3, 23, 9, 18, -2};
//        swap(arr, 2, 6);
//        swap(arr2, 0, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(getMax(arr2));
        System.out.println(getMin(arr));

        Collections.reverse(Arrays.asList(arr));
        StringBuilder stringBuilder = new StringBuilder();

//        System.out.println("Max in range: "+getMaximumItemInRange(arr, 2, 4));

//        System.out.println(Arrays.toString(reverseTempArray(arr2)));

//        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(reverTempArrayThirdMethod(arr2)));

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

    static int getMaximumItemInRange(int[] array, int beginIndex, int endIndex){
        int max = array[beginIndex];
        for(int i = beginIndex; i<=endIndex; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    static void reverseArray(int[] array){

        int start = 0;
        int end = array.length -1;

        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        }

    static int[] reverseTempArray(int[] array){
        int index =0;
        int[] tempArray = new int[array.length];

        for(int i =array.length-1; i>0; i--){
            tempArray[index]  = array[i];
            index++;
        }
        return tempArray;
    }

    static int[] reverseTempArraySecondMethod(int[] array){
        int l = array.length;
        int index = l;
        int[] tempArray = new int[l];
        for(int i =0; i<l; i++){
            tempArray[index -1] = array[i];
            index--;
         }
        return tempArray;
    }

    static int[] reverTempArrayThirdMethod(int[] array){
        int[] tempArray = new int[array.length];
        int index =0;

        for(int i=0; i<array.length; i++){
            tempArray[i] = array[array.length - 1 - i];
        }
        return tempArray;
    }

}
