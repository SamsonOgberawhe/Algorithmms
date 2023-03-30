import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RoughMain{
    public static void main(String[] args) {
        System.out.println("This is real");
        String word = "Charismatic";
        System.out.println(removeDuplicates(word));
    }


     static String removeDuplicates(String word){
        StringBuilder string = new StringBuilder();
        Set<Character> set = new TreeSet<>();
        word = word.toLowerCase();
        String[] chars = word.split("");
        for(int i =0; i<word.length(); i++){
            set.add(word.charAt(i));
        }
            for(Character item:set){
                string.append(item);
            }
            return string.toString();
    }

}