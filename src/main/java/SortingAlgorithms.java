import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] array = {55, 33, 76, 92, 81, 75, 21, 32, 11, 11, 11};

        System.out.println(Arrays.toString(linearSort(array)));


        System.out.println(getXO("xoxo"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("one");
        stringBuilder.append("two");
        stringBuilder.append("three");
        System.out.println(stringBuilder);
        Character.toString('o');

        int[] newArray = Arrays.copyOfRange(array, 3 , 9);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] linearSort(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j + 1]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static boolean getXO(String str){
        int x=0;
        int o =0;
        String[] array = str.split("");
        for(int i =0; i<array.length; i++) {
            if (array[i].equalsIgnoreCase("x")){
                x++;
            }
            else{
                o++;
            }
        }
        return x == o;
    }
    //implement a function that accepts 3 integer values a, b c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
    public static boolean isTriangle(int a, int b, int c){
//        return a + b > c && a + c > b && b + c > a;
        return a + b > c && a + c > b && b + c > a;

    }
}
