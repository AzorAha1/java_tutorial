import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        // simple for loop to print i love java
        // for(int i = 1, j = 1; i <=10 && j <= 5; i++, j++) {
        //     System.out.println(i + ": I love java");
        //     System.out.println("and also love python");
        // }

        //exercise
        // write a java program to accept an integer from the user and print its first
        // 10 multiples using for loop

        Scanner myScanner = new Scanner(System.in);
        int userinput;
        int output;
        System.out.print("Enter Number: ");
        userinput = myScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            output = userinput*i;
            System.out.printf("%d * %d = %d\n", userinput, i, output);
        }
        myScanner.close();
    }
}
