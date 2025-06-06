import java.util.Scanner;
/*
Problem Statement



James, a high school boy is assigned to find the sum of a three-digit number to find if the sum is greater than 12. Write a program to help him find the sum of the digits of the number and check if it is greater than 12.

Input format :
The input consists of an integer N.

Output format :
The first line of output prints "Sum: " followed by the sum of digits of N.

The second line prints one of the following:

If the sum of the digits of N is greater than 12, print "The sum of the digits is greater than 12"
Else, print "The sum of the digits is not greater than 12"


Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

100 ≤ N ≤ 999

Sample test cases :
Input 1 :
129
Output 1 :
Sum: 12
The sum of the digits is not greater than 12
Input 2 :
576
Output 2 :
Sum: 18
The sum of the digits is greater than 12
 */
public class VIT1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a = N%10;//Last digit
        int b = (N/10)%10;//10s digit
        int c = (N/100)%10;//Hundredths digit
        int sum = a+b+c;
        System.out.println("Sum: "+sum);
        if(sum<=12){
            System.out.println("The sum of the digits is not greater than 12");
            
        }
        else{
            System.out.println("The sum of the digits is greater than 12");
        }
        input.close();
    }
}
        
//Lookout for Syntax of scanners