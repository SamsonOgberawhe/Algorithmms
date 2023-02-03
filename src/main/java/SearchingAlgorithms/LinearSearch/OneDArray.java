package SearchingAlgorithms.LinearSearch;

public class OneDArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 66, 99, 45, 67, 32, 33};
        int[] array2 = {3, 2, 3233, 444,3};
        int[] arr2 = {};
        System.out.println(linearSearchWithForLoop(array, 33));
        System.out.println(linearSearchWithForEachLoop(array, 33));
        String string = "abomination";

        System.out.println(findTheIndexOfACharacterInAString(string, 'o'));
        System.out.println(searchForCharacterInStringInRange(string, 'a', 2, 7));
        System.out.println(getMinValue(array));
        System.out.println(getMaxValue(array));

        System.out.println(containsEvenNumberOfDigits(array2));


    }
    //Returns the index of the found number
    static int linearSearchWithForLoop(int[] array, int target){

        if(array.length == 0){
            return -1;
        }
        for(int i =0; i< array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;

    }

    static int linearSearchWithForEachLoop(int[] array, int target){
        //This method returns the element and not the indes
        if(array.length == 0){
            return -1;
        }
        for(int item: array){
            if(item == target){
                return item;
            }
        }
        return -1;
    }

    static int findTheIndexOfACharacterInAString(String string, char target){
        if(string == null){
            return -1;
        }
        for(int i =0; i<string.length(); i++){
            if(string.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    static int searchForCharacterInStringInRange(String string, char target, int start, int end){
        if(string == null){
            return -1;
        }
        for(int i = start; i<=end; i++){
            if(string.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
    static int getMinValue(int[] array){
//        int min = array[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    static int getMaxValue(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //Given an array that contains numbers, check if there is a number with even number of digits.

    static boolean containsEvenNumberOfDigits(int[] array) {
        boolean resp = false;
        for(int i = 0; i < array.length; i++){

            if(getNumberOfEvenDigitsWithString(array[i])){
               return true;
            }
        }
        return false;
    }
    static boolean getNumberOfEvenDigits(int number){
            int count = 0;
        while(number > 0){
            number=number/10;
            count++;
        }
        return count % 2 == 0;
    }

    static boolean getNumberOfEvenDigitsWithString(int number){
        String num = Integer.toString(number);
        if(num.length() % 2 == 0){
            return true;
        }
        return false;
    }

}
