import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hey There what is your name ?");
        String name = myScanner.nextLine();
        
        if (name.isEmpty()) {
            System.out.println("You did not enter a name");
            System.exit(0);
        }
        System.out.println("Hello " + name + " " + "it is nice to meet you !");

        System.out.println("Are you feeling good today(1. Yes 2. No)");
        int feeling = myScanner.nextInt();



        if (feeling == 1) {
            System.out.println("I glad to hear that");
        }
        else if (feeling == 2) {
            System.out.println("Oh im very sorry to hear that");
        }
        else {
            System.out.println("Damn you dont want to talk to me ?");
        }

        System.out.println("So how old are you ?");

        int age = myScanner.nextInt();
        if (age < 0) {
            System.out.println("You are not born yet");
            System.exit(0);
        }
        if (age <= 12) {
            System.out.println("oh you are still a baby !");
        } 
        else if (age < 18) {
            System.out.println("Happy Teen Years !");
        }
        else if (age == 18) {
            System.out.println("you are 18 !!\nthats officially an adult congrats");
        }
        else {
            System.out.println("Happy Adult life !");
        }

        myScanner.close();
    }
}
