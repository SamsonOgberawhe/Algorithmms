import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> stringList = List.of("Hello", "there", "th", "this", "alone", "json", "five");
        System.out.println(getList(stringList));
        System.out.println(getNewList(stringList));
    }
    public static int getList(List<String> stringList){
        List<String> newList = new ArrayList<>();
        for(String i: stringList){
            if(i.length() % 2 != 0){
                newList.add(i);
            }
        }
        return newList.size();
    }

    public static int getNewList(List<String>stringList){
        return (int)stringList.stream().filter(s -> s.length() % 2 != 0).count();
//        return stringList.stream().filter(s -> s.length() % 2 != 0).collect(Collectors.toList());
    }




}
