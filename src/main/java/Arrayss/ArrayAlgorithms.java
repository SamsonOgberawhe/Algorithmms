package Arrayss;

import java.util.Arrays;

public class ArrayAlgorithms {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSum(nums2)));

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
}
