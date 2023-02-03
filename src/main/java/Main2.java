public class Main2 {
    public static void main(String[] args) {
        System.out.println("This is a new algorithm");

        int one = 33;
        System.out.println("The hashcode is... " + Integer.hashCode(one));

        Athread athread = new Athread();

        Thread thread = new Thread(athread);
        thread.setPriority(Thread.MAX_PRIORITY);

        for(int i = 0; i < 5; i++ ){
            thread.start();
        }
      //How to start garbage collection
        System.gc();
        Runtime.getRuntime().gc();

    }

    public int sumTwoNumbers(int a, int b){
        return a + b;
    }

    public int subtractTwoNumbers(int a, int b){
        return a > b? a - b: b-a;
    }
}
