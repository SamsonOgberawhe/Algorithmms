import java.util.*;

public class main4 {
    public static void main(String[] args) {
        /**
         * Mike is organizing his shop. He has a few baskets of fruits which he wants to take inventory of before he puts it on the shelf.
         * He wants to count how many of each fruit he has across all the baskets and then order the list alphabetically before he notes it down.
         * Here are the fruit baskets with the amount of fruits in them:
         * orange 14
         * apple 16
         * banana 2
         * banana 6
         * kiwi 3
         * orange 9
         * apple 18
         * banana 4
         * orange 2
         * kiwi
         * */
        Student student = new Student.Builder()
                .setName("James")
                .setDescription("Hello there")
                .setScore(5)
                .build();
        System.out.println(student.toString());

        Map<String, Integer> map = new HashMap<>();
        map.put("orange", 14);
        map.put("apple", 16);
        map.put("banana", 2);
        map.put("banana", 6);
        map.put("kiwi", 3);
        map.put("orange", 9);
        map.put("apple", 18);


        String[][] arrays = {
                {"orange", "14"},
                {"apple", "16"},
                {"banana", "2"},
                {"banana", "6"},
                {"kiwi", "3"},
                {"orange", "9"},
                {"apple", "18"},
                {"banana", "4"},
                {"orange", "2"},
                {"kiwi", "5"}
        };
        sortedBasket(arrays);

        String[] array2 = {"orange 14", "apple 16", "banana 2", "banana 6", "kiwi 3",
                "orange 9", "apple 18", "banana 4", "orange 2", "kiwi 5"};

        int[] arr = {1, 2, 3, 4};
        System.out.println(sortedBasket2(array2));
        System.out.println(palindrome2("Rasr"));
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static void sortedBasket(String[][] arrays) {

        //Create a 2D array that holds arrays of the fruits
        // create a map, loop through the array and pass the fruits into the map
        //Sort the map with a Collections.sort

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 0);
        map.put("banana", 0);
        map.put("orange", 0);
        map.put("kiwi", 0);

        List<String> fruitList = new ArrayList<>();
        Map<String, Integer> sortedMap = new TreeMap<>();
        for (String[] array : arrays) {
            map.put(array[0], map.get(array[0]) + Integer.parseInt(array[1]));
        }
        for (Map.Entry<String, Integer> fruit : map.entrySet()) {
            fruitList.add(fruit.getKey());
            sortedMap.put(fruit.getKey(), map.get(fruit.getKey()));
        }
        System.out.println(sortedMap);

    }

    static boolean palindrome(String word) {
        StringBuilder builder = new StringBuilder();

//        for(int i = word.length() - 1; i>=0; i--){
//            builder.append(word.charAt(i));
//        }
        builder.append(word.toLowerCase());
        builder.reverse();
        return builder.toString().equals(word.toLowerCase());
    }

    static boolean palindrome2(String word) {

        String newWord = word.toLowerCase();
        String out = "";
        for (int i = newWord.length() - 1; i >= 0; i--) {
            out += newWord.charAt(i);
        }

        return newWord.equals(out);
    }

    static Map<String, Integer> sortedBasket2(String[] array) {

        Map<String, Integer> fruitMap = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<String> stringList = new ArrayList<>();

        for (String basket : array) {
            String[] parts = basket.split(" ");
            String fruit = parts[0];
            int count = Integer.parseInt(parts[1]);
            if (fruitMap.containsKey(fruit)) {
                fruitMap.put(fruit, fruitMap.get(fruit) + count);
            } else {
                fruitMap.put(fruit, count);
            }
        }
        for (Map.Entry<String, Integer> fruit : fruitMap.entrySet()) {
            stringList.add(fruit.getKey());
        }
        Collections.sort(stringList);

        for (String item : stringList) {
            sortedMap.put(item, fruitMap.get(item));
        }
        return sortedMap;
    }

    static int[] runningSum(int[] nums) {

        int[] newArray = new int[nums.length];

        newArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            newArray[i] = nums[i] + newArray[i-1];
        }
        return newArray;
    }
}