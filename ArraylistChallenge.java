import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistChallenge {
    public static void main(String[] args) {
        ArrayList<String> studentswholikemath = new ArrayList<>();
        studentswholikemath.addAll(Arrays.asList("Ram", "Tom", "Ravi", "Tanvi", "Vikas"));
        ArrayList<String> studentswholikescience = new ArrayList<>();
        studentswholikescience.addAll(Arrays.asList("John", "Ravi", "Abhi", "Vikas", "Faisal"));
        ArrayList<String> studentswholikeboth = new ArrayList<>();
        // studentswholikemath.add("Ram");
        // studentswholikemath.add("Tom");
        // studentswholikemath.add("Ravi");
        // studentswholikemath.add("Tanvi");
        // studentswholikemath.add("Vikas");

        // studentswholikescience.add("John");
        // studentswholikescience.add("Ravi");
        // studentswholikescience.add("Abhi");
        // studentswholikescience.add("Vikas");
        // studentswholikescience.add("Faisal");

        for (String student : studentswholikemath) {
            System.out.println("students who like maths are: " + student);
        }

        for (String student : studentswholikescience) {
            System.out.println("students who like science are: " + student);
        }


        for (String student : studentswholikemath) {
            if (studentswholikescience.contains(student)) {
                studentswholikeboth.add(student);
            }
        }
        for (String student : studentswholikeboth) {
            System.out.println("students who like both are: " + student);
        }

    }
}