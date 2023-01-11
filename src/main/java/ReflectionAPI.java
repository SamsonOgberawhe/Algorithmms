import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionAPI {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {

        Student student = new Student("John", 4, "Lonley");
        Class<? extends Student> studentClass = student.getClass();
        Class.forName("Name");

        Class<Student> studentClass2 = Student.class;

        System.out.println(Arrays.toString(studentClass.getAnnotations()));
        System.out.println(Arrays.toString(studentClass.getFields()));

        Method m = String.class.getMethod("toString");
        System.out.println(m.invoke(new Student("Hello", 44, "Description")));

    }
}
