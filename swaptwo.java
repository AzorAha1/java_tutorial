public class swaptwo {
    public static void main(String[] args) {
        // swap the value of variable a with b
        int a = 100;
        int b = 200;
        System.out.printf("The value of a is %d and the value of b is %d\n", a, b);
        // to swap you need a temp variable to store a 
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("now swapped the value of a is %d and the value of b is %d", a, b);
    }
}
