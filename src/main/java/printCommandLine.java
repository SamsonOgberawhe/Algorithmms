import java.util.ArrayList;
import java.util.List;

public class printCommandLine {
    public static void main(String[] args) {
        for(String s: args){
            System.out.println("first is " +s);
        }
        System.out.println(putAlphabetInAList());
    }
    static List<Character> putAlphabetInAList(){
        List<Character> characters = new ArrayList<>();
//        for(char a = 'a'; a <= 'z'; a++){
//            characters.add(a);
//        }
        char a = 'A';
        while(a <= 'Z'){
            characters.add(a);
            a++;
        }
        return characters;
    }
}
