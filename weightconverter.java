import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        double weight;
        double convertedweight;
        int currentweightunit;
        int choice;

        System.out.println("Welcome to the Weight Converter");

        System.out.println("Enter your weight: ");
        weight = myscanner.nextDouble();
        System.out.println("What is your weight in(1. kilograms 2.pounds): ");
        currentweightunit = myscanner.nextInt();

        System.out.println("What would you like to convert to(1. kilograms 2.pounds): ");
        choice = myscanner.nextInt();

        if (currentweightunit == 1 && choice == 2) {
            System.out.println("Your weight is in kilograms and you wish to convert to pounds");
            convertedweight = weight * 2.20462;
            System.out.println("Your weight in pounds is: " + convertedweight);
        } else if (currentweightunit == 2 && choice == 1) {
            System.out.println("Your weight is in pounds and you wish to convert to kilograms");
            convertedweight = weight / 2.20462;
            System.out.println("Your weight in kilograms is: " + convertedweight);
        
        } else if (currentweightunit == 1 && choice == 1){
            System.out.println("Your Weight is Already in Kilogram!");
            System.out.printf("Your weight in kilograms is %.2fkg", weight);
        } else if (currentweightunit == 2 && choice == 2){
            System.out.println("Your Weight is Already in Pounds!");
            System.out.printf("Your weight in pounds is %.2flbs", weight);
        } else {
            System.out.println("Invalid Input");
        }

        myscanner.close();
    }
}
