package Arrayss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayAlgorithms {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {0,0,1,2,2,3,3,4,5,6,6,7};

        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSum(nums2)));
        System.out.println(Arrays.toString(removeDuplicates(nums3)));
        System.out.println(Arrays.toString(removeDuplicates2(nums3)));

    }


    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

        Example
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    */
     static int[] runningSum(int[] nums){
        int[] newArray = new int[nums.length];
        newArray[0] = nums[0];

        for(int i = 1; i<nums.length; i++){
            newArray[i] = nums[i] + newArray[i - 1];
        }
        return newArray;
    }
    static int[] removeDuplicates(int[] SortedArray){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<SortedArray.length; i++){
            set.add(SortedArray[i]);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for(int num: set){
            newArray[index] = num;
            index++;
        }
    return newArray;
    }
    static int[] removeDuplicates2(int[] SortedArray){
         int addIndex = 1;
         int[] newArray = new int[SortedArray.length];

         newArray[0] = SortedArray[0]; // First element is always a unique number.
         for(int i = 0; i<SortedArray.length - 1; i++){
             if(SortedArray[i] < SortedArray[i + 1]){//if true, sortedArray[i + 1] is a new unique number
                 newArray[addIndex] = SortedArray[i + 1];
                 addIndex++;
                 System.out.println(SortedArray[i]);
             }
         }
        return newArray;
    }
}
