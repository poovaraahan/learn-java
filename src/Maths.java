import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        double a, b, c;// Declare variables for the sides of the triangle
        Scanner side = new Scanner(System.in);// Create a Scanner object 'side' to read input
        // Prompt the user to enter the lengths of the sides
        System.out.println("Enter the first side of the triangle A:");  
        a = side.nextDouble();
        System.out.println("Enter the second side of the triangle B:");
        b = side.nextDouble();
        // Calculate the length of the hypotenuse using the Pythagorean theorem
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The length of the hypotenuse C is: " + c);
        side.close();
    }
}
