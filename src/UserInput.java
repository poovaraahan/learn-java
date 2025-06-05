import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creays a scanner object to read input
        System.out.print ("What color is your bugatti? ");
        String color = input.nextLine();//reads a line of text input from the user
        System.out.print(""+ color +"? That's sus...\n");
        System.out.print("How old are you? ");
        int age = input.nextInt();//reads an integer input from the user
        System.out.print("Wow, " + age + " years old? That's pretty young!\n");
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Name a hobby you enjoy:\n");
        String hobbies = input.nextLine(); 
        System.out.print("Oh, you like " + hobbies + "? Weirdo\n");
        //It should work now.
        input.close(); // One final fix, Close the scanner to prevent resource leaks

        
    }

    
}
