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
/*
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.max(x,y);
        System.out.println("The maximum of " + x + " and " + y + " is: " + z);
    }
}
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.min(x,y);
        System.out.println("The minimum of " + x + " and " + y + " is: " + z);
    }
}
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.abs(x);
        System.out.println("The absoulute value of x is " + z);
        //Absolute of a number is the distance of the number from 0 on the number line.
        //positive and decimal value.
    }
}
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.sqrt(y); //Square root of y
        System.out.println("The square root of y is " + z);
    }
}
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.round(y); //Square root of y
        System.out.println("The integer value of y is " + z);//.0 at end of the number
    }
}
public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.ceil(y); // Round up to the nearest greater integer
        System.out.println("The nearest greater integer value of y is " + z);
        double w = Math.floor(y); // Round down to the nearest lesser integer
        System.out.println("The nearest lesser integer value of y is " + w);
    }
}
*/