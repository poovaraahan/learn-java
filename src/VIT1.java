import java.util.Scanner;
/*
 * Problem Statement



John is a fitness trainer, and he wants to use the BMI calculator to assess the body mass index of his clients. He has a list of clients with their height (in meters) and weight (in kilograms). 



John plans to write a program to quickly determine the BMI and provide a classification for each client.

If BMI is less than 18.5, the program will classify it as "Underweight"
If BMI is between 18.6 and 24.9, the program will classify it as "Normal Weight"
If BMI is between 25.0 and 29.9, the program will classify it as "Overweight"
If BMI is 30.0 or higher, the program will classify it as "Obese"


Formula to calculate BMI = weight/(height*height)

Input format :
The first line of input consists of a double value, representing the height of the person in meters.

The second line consists of a double value, representing the weight of the person in kilograms.

Output format :
The first line of output prints a double value, representing the BMI, rounded off to two decimal places.

The second line prints the category they belong to.



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1.1 ≤ height ≤ 7.5

1.1 ≤ weight ≤ 120.0

Sample test cases :
Input 1 :
1.2
45.2
Output 1 :
BMI: 31.39
Classification: Obese
Input 2 :
5.5
45.5
Output 2 :
BMI: 1.50
Classification: Underweight
Input 3 :
1.7
68.3
Output 3 :
BMI: 23.63
Classification: Normal Weight
Input 4 :
1.6
80.9
Output 4 :
BMI: 31.60
Classification: Obese
 */
public class VIT1{
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double weight = input.nextDouble();
        double BMI = (weight)/(height*height);
        System.out.printf("BMI: %.2f\n", BMI);
        if(BMI<18.5){
            System.out.println("Classificationn: Underweight");
        }
        else if(BMI>=18.6&&BMI<=24.9){
            System.out.println("Classification: Normal Weight");
        }
        else if(BMI>=25.0&&BMI<=29.9){
            System.out.println("Classification: Overweight");
        }
        else{
            System.out.println("Classification: Obese");
        }
        input.close();
    }
}