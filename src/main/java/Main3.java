import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {


        int[] array = {1,3,4,6,3, 7,8, 11};

        List<String> stringList = new ArrayList<>();
        int[] newArray = Arrays.stream(array).filter(s -> s > 5).toArray();

        Arrays.stream(newArray).forEach(System.out::println);

//        for(int i:newArray){
//            System.out.println("The item is: "+ i);
//        }

        Stream stream = Stream.of("one", "two");
        System.out.println("The items are " + stream.count());

        int[][] twoDArrays = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(twoDArrays));

        for(int i =0; i<2; i++){
            for(int j =0; j<2; j++){
                System.out.println(twoDArrays[i][j] + " ");
            }
            System.out.println();
        }

        int[][] anotherTwoDArrays = new int[3][3];
        anotherTwoDArrays[1][0] = 5;

        System.out.println(Arrays.deepToString(anotherTwoDArrays));
        System.out.println(twoDArrays.length);

        System.out.println(Arrays.deepToString(twoDArrays));
        System.out.println(twoDArrays[2][0]);

        //3D array
        int[][][]  threeDArrays = {
                {
                    {1, 2, 3}, {4, 6, 9}, {33, 58, 92}
                },
                {
                    {33, 44, 99}, {22, 88, 92}
                },
                {
                    {22, 44, 88,}, {2, 11, 9}
                }
        };

        System.out.println("three d" +Arrays.deepToString(threeDArrays));
    }
}
