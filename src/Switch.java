import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Create a Scanner object to read input from the user
        System.out.print("Vaanavil Nanba, what is your favorite color of the rainbow? ");
        String Vaanavil_Thozhargal = input.nextLine(); // Reads the user's favorite color
        input.close(); // Close the scanner to prevent resource leaks
        // Use a switch statement: Used to check and handle different cases for equivalence of strings.
        switch (Vaanavil_Thozhargal) {
            case "violet", "Violet":// Handle the case for "violet" or "Violet"
                System.out.println("Violet is the color of BTS.");
                break;
            case "Indigo", "indigo":
                System.out.println("Indigo is the color of exploitation.");
                break;
            case "Blue", "blue":
                System.out.println("Blue is the color of the sky.");
                break;
            case "Green", "green":
                System.out.println("Green is the color of Grasseon.");
                break;
            case "Yellow", "yellow":
                System.out.println("That's Gay.");
                break;
            case "Orange", "orange":
                System.out.println("Orange is a conspiracy.");
                break;
            case "Red", "red":
                System.out.println("Lollipop is the color of Red.");
                break;
            default:
                System.out.println("Why are you gay?");
            
        }
    }
    
}
