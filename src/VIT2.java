import java.util.Scanner;
public class VIT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int EvenSum = 0;
        int OddSum = 0; 
        if(n <= 0) {
            System.out.println("Please enter a positive integer");
            input.close();
            return; // Exit the program if n is not positive
        }
        
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                EvenSum  = EvenSum + i;
            }
            else{
                OddSum = OddSum + i;
            }
        }
        System.out.printf("Sum of even numbers from 1 to %d: %d\n",n,EvenSum);
        System.out.printf("Sum of odd numbers from 1 to %d: %d\n",n,OddSum);
        input.close();
    }
}
/*
        * Problem Statement



        John is learning to program, and he wants to create a program that calculates the sum of even and odd numbers within a range. He needs your help to design and implement this program.



        Write a program called "EvenOddSumCalculator" that takes a positive integer n as input and calculates and displays the sum of even numbers and the sum of odd numbers from 1 to n.

        Input format :
        The input consists of a single positive integer, n.

        Output format :
        If the input value is not a positive integer, the output displays the message, "Please enter a positive integer".

        If the input value is a positive integer, the output displays the following format:

        "Sum of even numbers from 1 to n: evenSum" (where evenSum is the sum of even numbers from 1 to n).

        "Sum of odd numbers from 1 to n: oddSum" (where oddSum is the sum of odd numbers from 1 to n).



        Refer to the sample output for the formatting specifications.

        Code constraints :
        The test cases will fall under the following constraints:

        1 ≤ n ≤ 150

        Sample test cases :
        Input 1 :
        5
        Output 1 :
        Sum of even numbers from 1 to 5: 6
        Sum of odd numbers from 1 to 5: 9
        Input 2 :
        -6
        Output 2 :
        Please enter a positive integer
 */
