import java.util.Scanner;
public class compoundinterestcal {
    public static void main(String[] args) {
        double principal;
        double rate;
        double timescompounded;
        double years;
        double amount;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = myScanner.nextDouble();

        System.out.print("Enter the rate: ");
        rate = myScanner.nextDouble() / 100;

        System.out.print("Enter the number of times the interest is compounded: ");
        timescompounded = myScanner.nextDouble();

        System.out.print("Enter the number of years: ");
        years = myScanner.nextDouble();

        amount = principal * Math.pow(1 + rate / timescompounded, timescompounded * years);
        System.out.println("The amount is: " + amount);

        myScanner.close();
    }
}
