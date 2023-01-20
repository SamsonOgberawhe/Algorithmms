import LinkedList.LinkedList;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    private static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
