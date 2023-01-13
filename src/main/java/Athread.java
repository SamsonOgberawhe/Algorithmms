public class Athread implements Runnable{


    @Override
    public void run() {
        System.out.println("The thread is being executed by " + Thread.currentThread().getName());

//            Thread.sleep(1000);
    }
}
