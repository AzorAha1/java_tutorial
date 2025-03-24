public class printformat {
    public static void main(String[] args) {

        // printf is used to format the output
        // %d is used to format integers
        // %f is used to format floating point numbers
        // %c is used to format characters
        // %s is used to format strings
        // %[flags][width][.precision]conversion-character
        int x = 10;
        double y = 20.556424;
        String name = "Faisal";
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", name.charAt(0));
        System.out.printf("The value of x is: %d\n", x);
        System.out.printf("The value of y is: %.2f\n", y);
    }
}
