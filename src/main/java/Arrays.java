

public class Arrays {
    public static void main(String[] args) {
        int[] array = {55, 33, 76, 92, 81, 75, 21, 32, 11, 11, 11};
        System.out.println(getMinValue(array));
        System.out.println(getMaxValue(array));
//        System.out.println("New array is " + java.util.Arrays.toString(removeIndex(array, 3)));
        System.out.println(searchForElement(array, 11));
        System.out.println(java.util.Arrays.toString(addIndex(array, 1, 25)));
    }

    //Get Minimum value
    public static int getMinValue(int[] array){
        int min = array[0];
        for(int i = 0; i< array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    //Get Maximum Value
    public static int getMaxValue(int[] array){
        int max = array[0];
        for(int i=0; i< array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //Remove an index
    public static int[] removeIndex(int[] array, int index){
        int[] newArray = new int[array.length -1];
        for(int i =0; i<array.length-1; i++){
            newArray[i] = array[i];
            if(i == index){
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }

    //add an index to an array
//    public static int[] addIndex2(int[] array, int index, int value){
//        int[] newArray = new int[array.length + 1];
//        for(int i =0; i<array.length; i++){
//            newArray[i] = array[i];
//            if(i == index){
//                newArray[i] = value;
//            }
//        }
//        return newArray;
//    }


    public static int[] addIndex(int[] array, int index, int value){
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
            if(i == index){
                newArray[i] = value;
            }
        }
        return newArray;
    }



    // Linear search through an array
    public static String searchForElement(int[] array, int item){
        String result = "Item found at: ";
        for(int i=0; i<array.length; i++){
            if(array[i] == item){
                result += i +", ";
            }
            else{
            }
        }
        return result;
    }

    //algorithm to remove index from an array
    //1. create a new array with size of the old array - 1
    //2. loop through the old array
    //3. if the index is not the index to be removed, add the value to the new array
    //4. if the index is the index to be removed, skip it
    //5. return the new array
}
