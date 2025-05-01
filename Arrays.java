public class Arrays {
    public static void main(String[] args) {
        // create an array of integers
        int[] ages = { 10, 20, 30, 40, 50 };
        // create an array of strings
        String[] names = { "John", "Jane", "Jack", "Jill", "Joe" };
        // create an array of doubles
        double[] prices = { 10.99, 20.99, 30.99, 40.99, 50.99 };
        // create an array of characters
        char[] letters = { 'A', 'B', 'C', 'D', 'E' };
        // create an array of booleans
        boolean[] flags = { true, false, true, false, true };
        // create an array of objects
        Object[] objects = { new Animal(), new Dog(), new Cat(), new Houses("Stark", "Winter is Coming", "The North", "A Wolf", "Eddard Stark") };
        // print the arrays

        // mix allocation and initialization of arrays
        int[] myarrays = new int[5]{1, 2, 3, 4, 5};
        // print the arrays
        System.out.println("My Arrays: ");
        for (int i = 0; i < myarrays.length; i++) {
            System.out.print(myarrays[i] + " ");
        }
        System.out.println("Ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        System.out.println("\nNames: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\nPrices: ");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nLetters: ");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println("\nFlags: ");
        for (boolean flag : flags) {
            System.out.print(flag + " ");
        }
        System.out.println("\nObjects: ");
        for (Object object : objects) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound();
            } else if (object instanceof Houses) {
                ((Houses) object).printDetails();
            } else {
                System.out.println(object);
            }
        }
    }
}
