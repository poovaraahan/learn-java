import java.util.Scanner;;
public class For {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";// Variable to store the symbol for the pattern
        System.out.println("Enter the number of rows: ");
        rows = input.nextInt();
        System.out.println("Enter the number of columns: ");    
        columns = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt(). Only then will Programme run
        System.out.println("Favorite hero?");
        symbol = input.nextLine();
        for(int i = 1; i<=rows; i++){
            System.out.println(); // Print a new line before each row
            for(int j = 1; j<=columns; j++){
                System.out.print(symbol + " "); // Print the symbol followed by a space
            }
        }
        input.close(); // Close the scanner to prevent resource leaks

    }


}
//In order to escape the inner loop, it has to complete its iterations first.
//So, first, if columns is 5, 5 adjacent symbols will be printed in a row.
//When we move to the outer loop, it will print a new line and for each iteration repeat the inner loop all over again.
//At every iteration of the outer loop, the index j of the inner loop will reset to 1, repeating the process until the outer loop's index i reaches the number of rows specified by the user.
//This is how the nested for loop works in this case.