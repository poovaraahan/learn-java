import java.util.Scanner;
public class LogicOp {
    public static void main(String[] args) {
        /*
        * Logical Opertators are used to combine multiple boolean expressions or conditions.
        * && (Logical AND): Returns true if both operands are true.
        * || (Logical OR): Returns true if at least one of the operands is true.
        * ! (Logical NOT): Inverts the value of a boolean expression.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Let's Play. Press 'q' or 'Q' to quit."); // Prompts the user for input
        String choice = input.nextLine(); // Reads the user's input
        if(choice.equals("q") || choice.equals("Q")){
            System.out.println("Nama Jeichitom Mara!");
        }
        else{
            System.out.println("Thothutiye Bigilu");
        }
        input.close(); // Closes the scanner to prevent resource leaks

    }
}

    

