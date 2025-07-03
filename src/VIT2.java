import java.util.Scanner;
public class VIT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.printf("%d is a perfect number", n);
        }
        else{
            System.out.printf("%d is not a perfect number", n);
        }
        input.close();
        /*OR
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        do{
            if(n%i == 0){
                sum = sum + i;
            }
            i++;
        }while(i<=n/2);
        if(sum == n){
            System.out.printf("%d is a perfect number", n);
        }
        else{
            System.out.printf("%d is not a perfect number", n);
        }
        input.close();
         */
        
    }
}
/*
        * Problem Statement

        Anil is fascinated by the concept of perfect numbers. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. For example, 28 is a perfect number because its divisors (excluding itself) are 1, 2, 4, 7, 14, and their sum is 28.
        Anil wants to create a program that determines whether a given positive integer is a perfect number or not. He needs your help to design and implement this program using a do-while loop.

        Input format :
        The input consists of a single positive integer n.

        Output format :
        If n is a perfect number, print "n is a perfect number".
        If n is not a perfect number, print "n is not a perfect number".



        Refer to the sample output for formatting specifications.

        Code constraints :
        1 ≤ n ≤ 105

        Sample test cases :
        Input 1 :
        50
        Output 1 :
        50 is not a perfect number
        Input 2 :
        28
        Output 2 :
        28 is a perfect number
 */
