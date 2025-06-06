import java.util.Random;// Import the Random class from the java.util package
public class Randomy {
    public static void main(String[] args) {
        Random random = new Random(); // Create an instance of the Random class
        int x = random.nextInt(6) + 1; // Generate a random integer between 1 and 6 (inclusive)
        System.out.println("Random number: " + x); // Print the random number
    }
}
