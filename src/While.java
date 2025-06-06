import java.util.Scanner; 
public class While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        //The do-while loop ensures that the code block is executed at least once
        do{
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }while(name.isEmpty()); // The loop continues until the user enters a non-empty name
        System.out.println("Hello, " + name + "!");
        input.close(); 
        // Though no difference of output in this case, there's a difference between do-while and while loops.
    }
    
}
