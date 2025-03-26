import java.util.Scanner;
public class ternaryoperator {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your number: ");
        int thenumber = scanner.nextInt();

        String oddoreven = thenumber % 2 == 0 ? "even" : "odd";

        System.out.println(oddoreven);
        // getting the maximum value
        int result = (x > y) ? x : y;

        // getting min value
        int result2 = (x < y) ? x : y;

        // checking even or  odd
        System.out.println("The maximum value is: " + result);
        System.out.println("The minimum value is: " + result2);

        scanner.close();
    }
}
