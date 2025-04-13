import java.util.Scanner;
public class enhancedswitches {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String day; 
        System.out.print("Enter the day of the week: ");
        day = myScanner.nextLine();
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thurday", "Friday" -> System.out.println("It is a week day 😞");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend 🥳");
            default -> System.out.printf("%s is not a Day", day);
        }
    }
}
