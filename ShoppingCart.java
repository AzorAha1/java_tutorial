import java.util.Scanner; 
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Welcome to the Shopping Cart");

        String item;
        double price;
        int quantity;

        System.out.println("What Item would you like to buy ?");
        item = myscanner.nextLine();

        System.out.println("What is the price of each item ?");
        price = myscanner.nextDouble();

        System.out.println("How many would you like to buy");
        quantity = myscanner.nextInt();

        System.out.println("You have bought " + quantity + " " + item);
        System.out.println("Your Total is $" + (quantity * price));
        myscanner.close();
    }
}