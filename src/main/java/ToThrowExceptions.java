import java.util.Scanner;

public class ToThrowExceptions {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundException
//        int[] arr = new int[5];
//        int ans = arr[6];

        //NumberFormatException
//        String a = "abc123";
//        int b = Integer.parseInt(a);

        //Arithmetic Exception
//        int a = 5;
//        int b = a/0;

        //IllegalArgument
//        throwIllegalArgument(14);
//        throw new IllegalArgumentException();

        //InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

        //NullPointerException


    }
    static void throwIllegalArgument(int number){
        if(number > 10){
            throw new IllegalArgumentException("Number must be greater than 10");
        }
    }
}
