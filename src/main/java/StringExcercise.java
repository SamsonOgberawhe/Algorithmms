public class StringExcercise {
    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(binarySearch(array, 8));
        StringCompare("hello\nhava");
        System.out.println(compareStrings("hello", "hava"));
        System.out.println(getFirstString("hello", "hava"));
    }

    public static int StringCompare(String word) {

        String[] array = word.split("\n");
        String a = array[0];
        String b = array[1];

        int sum = a.length() + b.length();
        System.out.println(sum);

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int result = a.compareTo(b);
        if (result < 0) {
            System.out.println(a + " comes before " + b + " in the dictionary.");
        } else if (result > 0) {
            System.out.println(a+ " comes before " + b + " in the dictionary.");
        } else {
            System.out.println(a + " and " + b + " are the same.");
        }

        String aCapital = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCapital = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aCapital + " " + bCapital);
        return sum;
    }


    //write an algorithm in java that takes in two strings and returns which one comes first in the dictionary
    //print the one that comes first in the dictionary

    //write an algorithm in java that takes in two strings and returns which one comes first in the dictionary
    //print the one that comes first in the dictionary
    public static String compareStrings(String a, String b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static String getFirstString(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result < 0) {
            return str1 + " comes before " + str2 + " in the dictionary.";
        } else if (result > 0) {
            return str2 + " comes before " + str1 + " in the dictionary.";
        } else {
            return str1 + " and " + str2 + " are the same.";
        }
    }
}



//    static int binarySearch(int[] sortedArray, int target) {
//
//        Arrays.sort(sortedArray);
//
//        if(sortedArray.length ==0){
//            return -1;
//        }
//        int start =0;
//        int end = sortedArray.length - 1;
//
//        while(start <= end){
//
//            int mid = (start + end)/2;
//
//            if(target < sortedArray[mid]){
//                end = mid -1;
//            }else if(target > sortedArray[mid]){
//                start = mid +1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//}

