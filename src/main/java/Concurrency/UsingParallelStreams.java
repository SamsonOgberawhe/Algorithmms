package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class UsingParallelStreams {

    public static void main(String[] args) {

        Student student = new Student("Samson", 5);
        Student student1 = new Student("Johnson", 6);
        List<Student> students = new ArrayList<>(List.of(student, student1));

        ForkJoinPool pool = new ForkJoinPool();

        //Parallel streams allow you to execute stream pipelines on multiple threads.
        // In the case below, the parallel stream runs its computation in the default forkJoin pool
        Future<Map<Integer, Long>> mapFuture = pool.submit(
                () -> students.parallelStream()
                        .collect(Collectors.groupingByConcurrent(Student::getAge, Collectors.counting()))
        );

    }
}
