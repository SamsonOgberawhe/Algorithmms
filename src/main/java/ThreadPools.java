import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.*;

public class ThreadPools {

    public static void main(String[] args) throws IOException, SQLException {
        ExecutorService  executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        ExecutorService executorService3 = Executors.newFixedThreadPool(7);

        ForkJoinPool pool = new ForkJoinPool();


        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
