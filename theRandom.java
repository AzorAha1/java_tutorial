import java.util.Random;
public class theRandom {
    public static void main(String[] args) {
        Random myRandom = new Random();
        // System.out.println(myRandom.nextInt(10));
        // System.out.println(myRandom.nextDouble());
        // System.out.println(myRandom.nextBoolean());
        // System.out.println(myRandom.nextFloat());
        // System.out.println(myRandom.nextLong());
        // System.out.println(myRandom.nextGaussian());
        int firstdice = myRandom.nextInt(1,6);
        int seconddice = myRandom.nextInt(1,6);
        System.out.println("The first dice is: " + firstdice);
        System.out.println("The second dice is: " + seconddice);

        if (firstdice == seconddice) {
            System.out.println("You have rolled a double");
        } else {
            System.out.println("You have not rolled a double");
        }
    }
}
