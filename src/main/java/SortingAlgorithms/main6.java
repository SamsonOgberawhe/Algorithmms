package SortingAlgorithms;

import java.util.*;

public class main6 {
    public static void main(String[] args) {
        String[] array = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] array2 = {"Kim Ramos: 45 6,Giovanni Landry"};

        System.out.println(newList(array));
        String[] Input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};

        System.out.println(newList(Input3));
        System.out.println(newList2(array));

//        calculateAverageMarks(array);
    }
    public static String calculateAverageMarks(String[] studentMarks) {
        Map<String, List<Integer>> studentMap = new HashMap<>();
        // Loop through the array of student marks and split the string into student name and marks
        for (String s : studentMarks) {
            String[] parts = s.split("\\s+"); // split by whitespace
            String student = parts[0];
            List<Integer> marks = new ArrayList<>();
            // Loop through the marks and add them to the list if they are within the range 1-10
            for (int i = 1; i < parts.length; i++) {
                int mark = Integer.parseInt(parts[i]);
                if (mark >= 1 && mark <= 10) {
                    marks.add(mark);
                }
            }
            studentMap.put(student, marks);
        }
        // Calculate the average marks for each student and format the output string
        StringBuilder sb = new StringBuilder();
        for (String student : studentMap.keySet()) {
            List<Integer> marks = studentMap.get(student);
            if (!marks.isEmpty()) {
                double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                sb.append(student).append("-").append((int) Math.round(average)).append("; ");
            }
        }
        return sb.toString().trim();
    }
    public static String newList (String[] students) {
        //         write your code here
        List<String> list = new ArrayList<>();
        for (String student : students) {
            String[] arr = student.split(" ");
            int sum = 0;
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                try {
                    int mark = Integer.parseInt(arr[i]);
                    if (mark >= 1 && mark <= 10) {
                        sum += mark;
                        count++;
                    }
                } catch (NumberFormatException e) {
                    // Ignore non-numeric values
                }
            }
            list.add(arr[0] + " " + arr[1] + "-" + sum / count);
        }
        return String.join("; ", list);
    }
     static String newList2 (String[] students) {
        List<String> list = new ArrayList<>();
        for (String student : students) {
            String[] arr = student.split("\\W+");
            int sum = 0;
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                try {
                    int mark = Integer.parseInt(arr[i]);
                    if (mark >= 1 && mark <= 10) {
                        sum += mark;
                        count++;
                    }
                } catch (NumberFormatException e) {
                    // Ignore non-numeric values
                }
            }
            String name = arr[0] + " " + arr[1].replace(":", "");
            list.add(name + "-" + sum / count);
        }
        return String.join("; ", list);
    }
}
