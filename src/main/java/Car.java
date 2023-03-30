public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("The vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped");
    }
}
