public class Recursion2 {
    public static void main(String[] args) {

        System.out.println(recurseSum(1001));
        System.out.println(fibSequence(50));
    }

    static int recurseSum(int n){
        if (n <= 0){
            return n;
        }
        return n + recurseSum(n-1);
    }
    static int fibSequence(int n){
        if(n == 0 || n ==1){
            return n;
        }
        return fibSequence(n - 1) + fibSequence(n-2);
    }
}
