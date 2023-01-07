import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {

        List<String> input = List.of("hello", "\t   ", "world", "", "\t", " ", "goodbye", "  ");

        Predicate<String> condition = (s) -> s.trim().isEmpty();

        System.out.println(CountNumberOfWhiteSpaces(input,condition) + " white spaces.");

    }

    public static long CountNumberOfWhiteSpaces(List<String> input, Predicate<String> condition){
        return input.stream().filter(condition).count();
    }


}