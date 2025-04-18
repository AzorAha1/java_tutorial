public class implicitandexplicittypecasting {
    public static void main(String[] args) {
        //implicit type casting examples
        // It’s when Java automatically converts one data type to another — without you writing anything — because it’s safe to do so.

// from   to

// byte   short, int, long, float, double

// short  int, long, float, double

// char   int, long, float, double

// int    long, float, double

// long   float, double

// float   double

        // byte a = 40;
        // int b = a;
        // System.out.println("value of b is : " + b);

        //example of explicit type casting 
        double d = 42.9;
        int x = (int) d; // double → int ❗️(you might lose decimals)
        System.out.println(x); 
    }
}
