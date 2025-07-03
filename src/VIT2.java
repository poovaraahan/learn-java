import java.util.Scanner;
public class VIT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SumOfDigits = input.nextInt();
        int digits = input.nextInt();
        System.out.println(findSmallestNumber(SumOfDigits, digits));
        input.close();
    }
    public static String findSmallestNumber(int SumOfDigits, int digits) {
        //Exception Handling 
        if(digits == 1){
            return (SumOfDigits >= 0 && SumOfDigits <= 9) ? Integer.toString(SumOfDigits) : "Not possible";

        }
        if (SumOfDigits < 1 || SumOfDigits > 9 * digits) {
            return "Not possible";
        }
        // Calculate first digit
        int firstDigit = Math.max(1, SumOfDigits - 9 * (digits - 1));
        int remainingSum = SumOfDigits - firstDigit;
        /*
         S - 9 * (D - 1)

        (D - 1) = Number of digits after the first digit.

        9 * (D - 1) = The maximum possible sum of the remaining D - 1 digits (if they are all 9).

        S - 9 * (D - 1) = The minimum value the first digit must take so that the remaining digits (which can be at most 9 each) can still sum up to the remaining value (S - firstDigit).

        Math.max(1, ...)

        Ensures the first digit is at least 1 (since a D-digit number can’t start with 0).

        If S - 9 * (D - 1) is less than 1, we default to 1.
         */
        
        String number = String.valueOf(firstDigit);
        for (int i = 1; i < digits; i++) {
            number += "0";
        }

        // Replace trailing zeros with digits from right to left
        for (int i = digits - 1; i >= 1 && remainingSum > 0; i--) {
            int digit = Math.min(9, remainingSum);
            // Replace the '0' at position i with 'digit'
            number = number.substring(0, i) + digit + number.substring(i + 1);
            remainingSum -= digit;
        }
        /*
         *  //Initial Setup//:

            We start with a number string like "10000" (for D=5)

            remainingSum is the amount we still need to distribute (e.g., 3 if S=4 and firstDigit=1)

            //Loop Parameters//:

            i = digits - 1: Starts at the last digit's index

            i >= 1: Continues until we reach the second digit (index 1)

            remainingSum > 0: Stops when we've distributed all needed sum

            //Digit Assignment//:

            Math.min(9, remainingSum) ensures we never put more than 9 in a digit

            If remainingSum is 3, we'll assign 3 to the current digit

            If remainingSum is 12, we'll assign 9 to this digit and carry over 3

            //String Manipulation//:

            number.substring(0, i): Gets all characters before position i

            digit: The new digit we're inserting

            number.substring(i + 1): Gets all characters after position i

            Concatenating these effectively replaces the digit at position i

            //Sum Adjustment//:

            remainingSum -= digit reduces our remaining sum by what we just assigned

            Next iteration will work with the reduced amount

            //Example Walkthrough//: (S=4, D=5)

            //Initial state//:

            number = "10000"

            remainingSum = 3 (after firstDigit=1)

            First iteration (i=4):

            digit = min(9, 3) = 3

            Replace last '0' with '3': "1000" + "3" + "" = "10003"

            remainingSum = 3 - 3 = 0

            Loop ends

            Final number: "10003"

            //Why This Works//:
            
            //Right-to-Left Assignment//:

            By assigning larger digits to the right, we keep the left digits small

            This ensures the overall number stays as small as possible

            //Greedy Approach//:

            We always assign the maximum possible (up to 9) to the current digit

            This minimizes the digits to the left, creating the smallest number

            //String Handling//:

            Using substrings avoids direct char manipulation

            Each replacement creates a new string with one digit changed
         */

        return number;
    }
}


/*
Write a program to find the smallest number with a given digit sum S and a given number of digits D.



Example:

The inputs are 9 and 2. There are many other possible numbers, like 45, 54, 90, etc., with the sum of digits of 9 and the number of digits of 2.

The smallest of them is 18.

Input format :
The input consists of two integers, S and D.

Output format :
The output prints the smallest number that is formed with the given sum and the given digit.



Refer to the sample output for formatting specifications.﻿

Code constraints :
1 ≤ S ≤ 45

1 ≤ D ≤ 5

Sample test cases :
Input 1 :
9
2
Output 1 :
Smallest number is 18
Input 2 :
4
5
Output 2 :
Smallest number is 10003
Input 3 :
50
5
Output 3 :
Not possible
Input 4 :
0
1
Output 4 :
Smallest number is 0
 */

    
