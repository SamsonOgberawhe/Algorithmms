import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] array = {55, 33, 76, 92, 81, 75, 21, 32, 11, 11, 11};

        System.out.println(Arrays.toString(linearSort(array)));


    }
    public static int[] linearSort(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j + 1]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
