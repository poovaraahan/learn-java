import java.util.Scanner; 
public class While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        //The while loop executes a line of code, as long as the condition is true.
        //In this case, it will keep asking for the name until a non-blank name is entered.
        while(name.isBlank()){//.isBlank() checks if the string is empty or contains only whitespace
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }
        System.out.println("Hello, " + name + "!");
        input.close(); 
    }
    
}
