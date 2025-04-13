import java.util.Scanner;
public class temperatureconverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double temperature;
        String currenttemperature;
        String choice;
        double convertedtemperature;
        String output;




        System.out.println("WELCOME TO TEMPERATURE CONVERTER !!!");

        System.out.print("Enter Temperature: ");
        temperature = myScanner.nextDouble();
        myScanner.nextLine(); // To clear the buffer

        System.out.print("What Currently is the temperature in ? (C or F): ");
        currenttemperature = myScanner.nextLine();

        System.out.print("What would you like to convert to ? (C or F): ");
        choice = myScanner.nextLine();

        convertedtemperature = (choice.equals("f") && currenttemperature.equals("c")) ? 9/5 * (temperature + 32) : (5/9) * (temperature - 32);

        convertedtemperature = (currenttemperature.equals("c") && choice.equals("f")) ? (9.0 / 5) * temperature + 32 : convertedtemperature; 

        output = (choice.equals("f")) ? "°F" : "°C";
        System.out.println(convertedtemperature + output); 
    }
    

}
