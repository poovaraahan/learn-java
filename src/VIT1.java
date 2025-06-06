import java.util.Scanner;
/*
 * Problem Statement

Suresh, a tax consultant, assists clients to determine their tax bracket based on their annual income and potential deductions. He wants to create a program that calculates the effective annual income after applying a deduction and determines the tax bracket based on the effective income.

1.	If the client is eligible for deductions (indicated by Yes/yes), subtract 1,000 from their annual income.
2.	Based on the effective income after deductions, categorize the tax bracket as follows:
3.	Low Income: If the effective income is 20,000 or less.
4.	Middle Income: If the effective income is between 20,001 and 50,000, inclusive.
5.	High Income: If the effective income exceeds 50,000.

Can you guide Suresh in writing the program?
Input format :
The first line of input consists of a double value, representing the annual income.
The second line consists of a string, indicating if the client is eligible for deductions.
Output format :
The first line of output prints a double value, representing the effective income, rounded off to two decimal places.
The second line prints the tax bracket.

Refer to the sample output for formatting specifications.
Code constraints :
5000.00 ≤ annual income ≤ 200000.0
Sample test cases :
Input 1 :
55000.75
Yes
Output 1 :
Effective Income: 54000.75
Tax Bracket: High Income
Input 2 :
18500.0
No
Output 2 :
Effective Income: 18500.00
Tax Bracket: Low Income
Input 3 :
23945.56
yes
Output 3 :
Effective Income: 22945.56
Tax Bracket: Middle Income
Input 4 :
78965.89
no
Output 4 :
Effective Income: 78965.89
Tax Bracket: High Income

 */
public class VIT1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double AnnualIncome = input.nextDouble();
        input.nextLine();
        String eligiblity = input.nextLine();
        if(eligiblity.equals("Yes")||eligiblity.equals("yes")){
            AnnualIncome = AnnualIncome - 1000;
            System.out.println("Effective Income: " + AnnualIncome);
        }
        else{
            System.out.println("Effective Income: " + AnnualIncome);
        }
        if(AnnualIncome<=20000){
            System.out.println("Tax Bracket: Low Income");
        }
        else if(AnnualIncome>=20001 && AnnualIncome<=50000){
            System.out.println("Tax Bracket: Middle Income");
        }
        else{
            System.out.println("Tax Bracket: High Income");
        }
        input.close();
    }
}
