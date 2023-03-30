import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class main5 {
    public static void main(String[] args) {

        List<Integer>integerList = List.of(1, 33, 92, 6, 8);
        System.out.println(getMax(integerList));
        System.out.println(getMax2(integerList));
        System.out.println(getMax3(integerList));
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
     static void printLen(String str){
        System.out.println(str.length());

    }
    static int getMax(List<Integer> integerList){
        return integerList.stream().max(Comparator.naturalOrder()).get();
    }

    static int getMax2(List<Integer> integers){

        Optional<Integer> optional =  integers.stream().reduce(Integer::max);
        return optional.get();
    }

    static int getMax3(List<Integer> integers){

       return integers.stream().mapToInt(Integer::intValue).max().getAsInt();

    }
}
