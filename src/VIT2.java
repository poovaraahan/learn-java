import java.util.Scanner;
public class VIT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();  // Removed "int" from this line
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print("Fizzbuzz\t");
            } else if (arr[i] % 3 == 0) {
                System.out.print("Fizz\t");
            } else if (arr[i] % 5 == 0) {
                System.out.print("Buzz\t");
            } else {
                System.out.print(arr[i] + "\t");  // Added tab for consistent formatting
            }
        }
        input.close();  // Good practice to close the Scanner
    }
}
/*
 * Problem Statement



Rohan is a software developer working on a program to print a sequence of numbers based on certain conditions. He needs to implement a "FizzBuzz" logic, which prints "Fizz" for numbers divisible by 3, "Buzz" for numbers divisible by 5, and "FizzBuzz" for numbers divisible by both 3 and 5. For all other numbers, it should print the number itself. 



Can you help Rohan write a program to achieve this?

Input format :
The first line contains an integer 'n', representing the number of elements in the array.

The second line contains 'n' space-separated integers, representing the elements of the array.

Output format :
The program prints 'n' space-separated results.

If the i-th element in the array is divisible by both 3 and 5, print "FizzBuzz".

If it is divisible by 3, print "Fizz".

If it is divisible by 5, print "Buzz".

For all other elements, print the number itself.



Refer to the sample output for format specifications.

Code constraints :
1 ≤ n ≤100.

1 ≤ elements ≤ 100.

Sample test cases :
Input 1 :
10
1 3 4 5 6 7 9 10 15 30
Output 1 :
1 Fizz 4 Buzz Fizz 7 Fizz Buzz FizzBuzz FizzBuzz 
Input 2 :
10
1 2 4 17 7 8 11 13 14 16
Output 2 :
1 2 4 17 7 8 11 13 14 16 
 */
    