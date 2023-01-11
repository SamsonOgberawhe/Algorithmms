import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[10];
        System.out.println(strings[9]);


        int i = 0;

//        while(i<=5){
//            System.out.println("This is the value of i = " + i);
//            i++;
//        }
        System.out.println("****************\n");

        do{
            System.out.println("This is the value of i " + i);
            i++;
        }while(i< 5);
int u =0;
  int[] arr = {2,3,4,5,3};
  for(int k =1; k < 5; i++){
      u += arr[k];
  }

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

    public static int printMoney(int amount){
        return 30;
    }

    public static String printMoney(String money){
        return "";
    }
}
