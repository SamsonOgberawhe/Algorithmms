public class Main2 {
    public static void main(String[] args) {
        System.out.println("This is a new algorithm");

       long pid = ProcessHandle.current().pid();
        System.out.println("The pid is " + pid);

       long mem =  (Runtime.getRuntime().totalMemory()) / 1000000;
        System.out.println("KB: " + mem);


    }
}
