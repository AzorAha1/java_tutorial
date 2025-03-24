import java.util.Scanner;
public class Mathclass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.ceil(7.4));
        System.out.println(Math.floor(7.8));
        System.out.println(Math.max(8.6, 5.2));
        System.out.println(Math.min(8.6, 5.2));
        System.out.println(Math.pow(5, 3));
        System.out.println(Math.sqrt(64));

        
        System.out.println(Math.cbrt(64));
        System.out.println(Math.hypot(3, 4));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //calculate the hypotenuse of a right-angled triangle
        Scanner myScanner = new Scanner(System.in);
        double side1;
        double side2;
        System.out.println("Enter the value of side1: ");
        side1 = myScanner.nextDouble();
        System.out.println("Enter the value of side2: ");
        side2 = myScanner.nextDouble();
        System.out.println("The hypotenuse of the right-angled triangle is: " + Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)));

        //calculate the circumference of a circle
        double radius;
        System.out.println("Enter the value of the radius: ");
        radius = myScanner.nextDouble();
        System.out.println("The circumference of the circle is: " + (2 * Math.PI * radius));

        //calculate the area of a circle
        System.out.println("The area of the circle is: " + (Math.PI * Math.pow(radius, 2)));

        //volume of a sphere
        System.out.println("The volume of the sphere is: " + ((4/3) * Math.PI * Math.pow(radius, 3)) + " cm^3");


        myScanner.close();
    }
}
