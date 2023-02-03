import com.sun.jdi.VoidType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Student");

        int[] array = {3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {3, 5, 2, 7, 1, 99, 66, 32};
        System.out.println(binSearch(array, 10));
        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));

        String newOptional = stringOptional.get();
        System.out.println(newOptional);
        System.out.println(stringOptional.isEmpty());

        List<Void> one = new ArrayList<>();
    }

    static int binSearch(int[] array, int item){

        int start = 0;
        int end = array.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(item < array[mid]){
                end = mid - 1;
            }
            else if(item > array[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static void bubbleSort(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j = 1; j<array.length - i; j++){
//                int temp =0;
                if(array[j]< array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}

