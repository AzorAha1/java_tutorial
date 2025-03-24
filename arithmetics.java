import java.util.Scanner;

public class arithmetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x;
        int y; 
        // sum of x and y
        System.out.println("Enter the value of x: ");
        x = myScanner.nextInt();
        System.out.println("Enter the value of y: ");
        y = myScanner.nextInt();
        System.out.println("The sum of x and y is: " + (x + y));
        // difference of x and y
        System.out.println("The difference of x and y is: " + (x - y));
        // product of x and y
        System.out.println("The product of x and y is: " + (x * y));
        // division of x and y
        System.out.println("The division of x and y is: " + (x / y));
        // remainder of x and y
        System.out.println("The remainder of x and y is: " + (x % y));
        // increment of x
        System.out.println("The increment of x is: " + (++x));
        // decrement of y
        System.out.println("The decrement of y is: " + (--y));
        
        // closing the scanner
        myScanner.close();

        
    }
}