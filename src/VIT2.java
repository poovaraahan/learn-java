import java.util.Scanner;
public class VIT2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            if (isPalindrome(n)) {
                System.out.println(n + " is a palindrome");
            } else {
                System.out.println(n + " is not a palindrome");
            }
        }

       public static boolean isPalindrome(int num) {
        int original = num;      // Store the original number for comparison later
        int reversed = 0;        // Initialize reversed number to 0

        while (num > 0) {        // Loop until num becomes 0
            int digit = num % 10;    // Extract the last digit of num
            reversed = reversed * 10 + digit;  // Append the digit to reversed
            num /= 10;           // Remove the last digit from num
        }
        return original == reversed;  // Check if original and reversed are equal
    }
}
/*
        * Problem Statement

        Emily, an aspiring programmer, is exploring the concept of palindromic numbers. A palindromic number is an integer that reads the same backward as forward. 

        For example:
        121121121 and 123211232112321 are palindromes, while 123123123 is not. 
        
        Emily wants to create a program that determines whether a given integer is a palindrome. Your task is to write a program that helps Emily by checking if a given integer is a palindrome.

        Input format :
        The input consists of an single integer n.

        Output format :
        The output displays the following format:

        If the number is a palindrome, print: "{number} is a palindrome".

        If the number is not a palindrome, print: "{number} is not a palindrome".

        Refer to the sample output for the formatting specifications.

        Code constraints :
        1 ≤ n ≤104

        Sample test cases :
        Input 1 :
        12321
        Output 1 :
        12321 is a palindrome
        
        Input 2 :
        1245
        Output 2 :
        1245 is not a palindrome
 */