public class Recursion {
    public static void main(String[] args) {

        printNumbers(1);
        System.out.println(sum(10));
        System.out.println(fibonacciSequence(6));

        System.out.println("Sequence starts from here");
        for(int i =0; i<50; i++){
//            System.out.println(fibonacciSequence(i));
            System.out.println(fibonacciSequenceWithFormula(i));
        }
    }

     static void printNumbers(int n){
        if(n > 5){return;}
         System.out.println("Number is: "+n);
        printNumbers(n+1);
     }
     static int sum(int n){
        if(n == 0 || n== 1){
         return n;
        }else{
            return n + sum(n - 1);
        }
     }

     static int fibonacciSequence(int n){
        if(n < 2){
            return n;
        }else{
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }
     }

     static int binarySearchWithRecursion(int[] array, int target, int start, int end){
            if(start > end){
                return -1;
            }
            int mid = (start + (end - start))/2;
            if(array[mid] == target){
                return mid;
            }
            if(target < mid){
                binarySearchWithRecursion(array, target, start, mid-1);
            }
            return binarySearchWithRecursion(array, target, mid +1, end);
     }

     static int fibonacciSequenceWithFormula(int n){
         return (int)((Math.pow(((1 + Math.sqrt(5))/2), n))/Math.sqrt(5));
     }
}
