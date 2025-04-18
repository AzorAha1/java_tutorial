import java.util.Scanner;
public class methodparameters {
    public static void main(String[] args) {
        displayName("faisal", 5);
    }

    // method to display name x amount of times
    public static void displayName(String name, int times) {
        int i;
        for (i = 1; i < times; i++) {
            System.out.println(name);
        }
    }
}
