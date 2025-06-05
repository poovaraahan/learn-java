import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("What color is your bugatti? ");
        String color = input.nextLine();
        System.out.print(""+ color +"? That's sus...\n");
    }

    
}
