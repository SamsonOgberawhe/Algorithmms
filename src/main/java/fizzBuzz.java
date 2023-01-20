import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class fizzBuzz {

    public static void main(String[] args) {

        List<Integer> integerList = new Vector<>();
        for(int i = 0; i<100; i++){
            integerList.add(i);
        }
        printFizzBuzz(integerList);
    }
    public static void printFizzBuzz(List<Integer> numberList){

        numberList.forEach(System.out::println);
    }
}
