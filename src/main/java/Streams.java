import java.io.Reader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

//        List<Integer> integerList = List.of(1, 5, 7, 2, 3, 4, 33, 99, 100, 30, 0, 84, 58);
//        System.out.println(getNumbersLessThanTen(integerList));
//
//        Student Samson = new Student("Samson", 22);
//        Student James = new Student("James", 44);
//        Student Simon = new Student("Mattew", 20);
//
//        List<Student> students = List.of(Samson, Simon, James);
//        System.out.println("Highest score " +getHighestScore(students));
//
//        int totalAge = students.stream().mapToInt(Student::getScore).sum();
//        System.out.println("Total age is: " + totalAge);
//        int averageScore = ((int) students.stream().mapToInt(Student::getScore).average().orElse(0));
//
//        Path p = Path.of("this");
//
//    }
//    public static Set<Integer> getNumbersLessThanTen(List<Integer> list){
//        return list.stream().filter(s -> s < 10).sorted().filter(s -> s < 5).collect(Collectors.toSet());
//    }
//
//
//    public static int getHighestScore(List<Student> students){
//        return students.stream()
//                .filter(Objects::nonNull)
//                .mapToInt(Student::getScore)
//                .max()
//                .orElse(0);
    }
}
