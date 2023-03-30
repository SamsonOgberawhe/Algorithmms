package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCodeArrays {

    public static void main(String[] args) {
        int[] array = {2,3,5,1,3};

        System.out.println(kidsWithCandies(array, 3));
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("notapangram"));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] output = new boolean[candies.length];
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            list.add(isMax(candies, (candies[i] + extraCandies)));
        }
        return list;
    }
    static boolean isMax(int[] array, int num){
        int max = 0;
        List integerList = new ArrayList<>(Arrays.asList(array));
//        integerList.stream().max(Integer::compare).get();
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return num >= max;
    }

    static boolean checkIfPangram(String sentence) {
        int count =0;
        String word = "abcdefghijklmnopqrstuvwxyz";
        String[] alph = word.split("");
        String[] sent = sentence.split("");
        List<String> list = new ArrayList<>(Arrays.asList(sent));
        for(String letter: alph){
            if(list.contains(letter)){
                count++;
            }
        }
        return count ==26;
    }
}
