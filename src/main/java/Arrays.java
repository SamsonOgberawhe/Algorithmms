public class Arrays {
    public static void main(String[] args) {
        int[] array = {55, 33, 76, 92, 81, 75, 21, 32, 11};
        System.out.println(getMinValue(array));
        System.out.println(getMaxValue(array));
    }

    //To find the minimum value of an array
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
    public int[] removeIndex(int[] array, int index){
        if()
    }
}
