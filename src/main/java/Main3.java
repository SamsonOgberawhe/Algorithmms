import com.sun.jdi.VoidType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Student");

        String newOptional = stringOptional.get();
        System.out.println(newOptional);
        System.out.println(stringOptional.isEmpty());

        List<Void> one = new ArrayList<>();
    }
}

