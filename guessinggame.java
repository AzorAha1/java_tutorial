import java.util.Random;
import java.util.Scanner;
public class guessinggame {
    public static void main(String[] args) {
        int Userguess;
        int Randomnumber;

        Random myRandom = new Random();
        Randomnumber = myRandom.nextInt(1, 101);
        System.out.println(Randomnumber);
        Scanner myScanner = new Scanner(System.in);
        boolean guessedcorrectly = false;
       
        int attempts = 0;
        while(attempts < 3){
            System.out.print("Enter Your Guess(1-100):");
            Userguess = myScanner.nextInt();
            attempts++;
            if(Userguess > Randomnumber) {
                System.out.println("TOO HIGH!!! Try Again");
            }
            else if(Userguess < Randomnumber) {
                System.out.println("TOO LOW!!! Try Again");
            }
            if (Userguess == Randomnumber){
                System.out.printf("You are right %d is the random number", Randomnumber);
                guessedcorrectly = true;
                break;
            }
            
        }
        if (!guessedcorrectly){
            System.out.println("You are out of Guesses sorry You lose :(");
        }
        
    }
}