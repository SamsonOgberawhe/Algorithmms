import java.lang.*;
public class StringAlgo {

    public static void main(String[] args) {

//        System.out.println(printDuplicatesCharacters("hellooo"));
        System.out.println(StringAlgo.printDuplicateChars("Great responsibility"));
    }

//    public static String printDuplicatesCharacters(String string){
//        StringBuilder newString = new StringBuilder();
//        for(int i =0; i<string.length(); i++){
//            for(int j =0; j<string.length(); j++){
//                if(string.charAt(i) == string.charAt(j)){
//                    newString.append(string.charAt(i));
//                }
//            }
//        }
//        return newString.toString();
//    }

    //Algorithm to print duplicate characters from a string
//    public static void printDuplicatesCharacters(String string){
//        int count = 0;
//        char[] chars = string.toCharArray();
//        System.out.println("Duplicate characters are: ");
//        for(int i =0; i<string.length(); i++){
//            for(int j =i+1; j<string.length(); j++){
//                if(chars[i] == chars[j]){
//                    System.out.println(chars[j]);
//                    count++;
//                    break;
//                }
//            }
//        }
//    }

    /*
    Convert the string to an array of characters.
    Loop through the characters and set count to
    */
    public static String printDuplicateChars(String s){

        StringBuilder st = new StringBuilder();
        int count =0;
        char[] chars = s.toCharArray();
        System.out.println("Character is : ");

        for(int i =0; i<chars.length; i++){
            for(int j= i+1; j<chars.length; j++){
                if(chars[i] == chars[j] && chars[i] != ' '){
                    st.append(chars[j]);
//                    System.out.println(chars[j]);
                }
            }
        }
        return st.toString();
    }

}
