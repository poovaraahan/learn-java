import java.util.Scanner;
/*
 Problem Statement



Alice, an insurance agent, needs a program to calculate the insurance premium for her clients based on their age and health condition. 



The premium amount is determined by the following rules:

If the client's age is between 18 and 30 years:
'excellent' health condition: 500.0
'good' health condition: 700.0
Any other health condition: 900.0
If the client's age is between 31 and 50 years:
'excellent' health condition: 700.0
'good' health condition: 900.0
Any other health condition: 1100.0


Write a program that takes the age and health condition of a client as input and outputs the corresponding insurance premium.

Input format :
The first line of input contains an integer representing the age of the client.

The second line contains a string representing the health condition of the client.

Output format :
The output prints a double value, representing the insurance premium.



Refer to the sample output for formatting specifications.

Code constraints :
Age input will be a positive integer. Health condition input will be a lowercase string.

Sample test cases :
Input 1 :
25
excellent
Output 1 :
500.0
Input 2 :
31
good
Output 2 :
900.0
Input 3 :
41
poor
Output 3 :
1100.0
 */
public class VIT1{
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.nextLine();
        String hc = input.nextLine();
        if(age>18&&age<30){
            if(hc.equals("excellent")){
                System.out.print(500.0);
            }
            else if(hc.equals("good")){
                System.out.print(700.0);
            }
            else{
                System.out.print(900.0);
            }
        }
        else{
            if(hc.equals("excellent")){
                System.out.print(700.0);
            }else if(hc.equals("good")){
                System.out.print(900.0);
            }else{
                System.out.print(1100.0);
            }
        }
        input.close();
    }
}
//Lookout for Syntax of scanners