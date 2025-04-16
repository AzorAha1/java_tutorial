import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        String uclwinners = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Who will win the UCL this year?");
        uclwinners = myScanner.nextLine().trim();
        while (!uclwinners.equalsIgnoreCase("realmadrid")) {
            System.out.printf("%s hahaha Come on be serious ", uclwinners);
            System.out.println("Who will win the UCL this year?");
            uclwinners = myScanner.nextLine().trim();
        }
        System.out.printf("You are right, %s will win the UCL this year", uclwinners);
    }
}
