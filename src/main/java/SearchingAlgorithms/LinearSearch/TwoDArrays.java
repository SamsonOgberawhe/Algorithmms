package SearchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {

        int[][] twoDArray = {
                {1, 3, 4, 5},
                {66, 43, 43,2},
                {44, 32, 12, 82}
        };

        System.out.println(Arrays.toString(searchTwoDArrayAndReturnRowAndColumn(twoDArray, 12)));
        System.out.println(findMaximumItemInTwoDArray(twoDArray));
        System.out.println(findMinimumItemInTwoDArray(twoDArray));

    }
    //Search a two the array and return the number of the row and column in which the element is found
    static int[] searchTwoDArrayAndReturnRowAndColumn(int[][] twoDArray, int target){
        if(twoDArray.length == 0){
            return new int[]{-1, -1};
        }
        for(int i = 0; i< twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if(twoDArray[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int findMaximumItemInTwoDArray(int[][] twoDArray){
        int max = twoDArray[0][0];
        if(twoDArray.length == 0){
            return -1;
        }
        for(int i =0; i<twoDArray.length; i++){
            for(int j = 0; j< twoDArray[i].length; j++){
                if(twoDArray[i][j] > max){
                    max = twoDArray[i][j];
                }
            }
        }
        return max;
    }

    static int findMinimumItemInTwoDArray(int[][] twoDArray){
        int min = twoDArray[0][0];
        if(twoDArray.length == 0){
            return -1;
        }
        for(int i =0; i<twoDArray.length; i++){
            for(int j = 0; j< twoDArray[i].length; j++){
                if(twoDArray[i][j] < min){
                    min = twoDArray[i][j];
                }
            }
        }
        return min;
    }
}
