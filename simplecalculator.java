import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        String operator;
        double firstnumber;
        double secondnumber;
        double result = 0;
        System.out.println("Welcome to a simple Calculator Program");
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        firstnumber = myScanner.nextDouble();

        // clear buffer
        myScanner.nextLine();
        System.out.print("Enter an Operation(+, -, *, /, ^): ");
        operator = myScanner.nextLine().trim();
        System.out.print("Please Enter Second Number: ");
        secondnumber = myScanner.nextDouble();

        switch (operator) {
            case "+" -> result = firstnumber + secondnumber;
            case "-" -> result = firstnumber - secondnumber;
            case "*" -> result = firstnumber * secondnumber;
            case "^" -> result = Math.pow(firstnumber, secondnumber);
            case "/" -> {
                if (secondnumber == 0) {
                    System.out.println("cannot divide by zero");
                    return;
                } else {
                    result = firstnumber / secondnumber;
                }
            }
            default -> {
                System.out.println("Invalid input");
                return;
            }
        }
    
        System.out.printf("Result: %.2f\n", result);
        myScanner.close();
    }
}