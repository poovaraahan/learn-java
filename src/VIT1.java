import java.util.Scanner;
/*Problem Statement



Given an integer as an input, representing the temperature in centigrade. Determine the weather conditions based on the temperature.



Temperature < 0, then print "Freezing weather".
Temperature 0 - 9, then print "Very cold weather".
Temperature 10 - 19, then print "Cold weather".
Temperature 20 - 29, then print "Normal in temperature".
Temperature 30 - 39, then print "It's hot".
Temperature >= 40, then print "It's very hot".
Input format :
The input consists of a single integer T, representing the temperature.

Output format :
The output prints the weather conditions based on the given temperature.



Refer to the sample outputs for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

−100 ≤ T ≤ 100

Sample test cases :
Input 1 :
-2
Output 1 :
Freezing weather
Input 2 :
0
Output 2 :
Very cold weather
Input 3 :
10
Output 3 :
Cold weather
Input 4 :
20
Output 4 :
Normal in temperature
Input 5 :
30
Output 5 :
Its hot
Input 6 :
44
Output 6 :
Its very hot */

public class VIT1{public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt(); //keep forgetting the damn brackets
        if(temp<0){
            System.out.println("Freezing weather");
        }
        else if(temp>=0 && temp<=9){
            System.out.println("Very cold weather");
        }
        else if(temp>=10 && temp<=19){
            System.out.println("Cold weather");
        }
        else if(temp>=20 && temp<=29){
            System.out.println("Normal in temperature");
        }
        else if(temp>=30 && temp<=39){
            System.out.println("It's hot");
        }
        else{
            System.out.println("It's very hot");
        }
        input.close();
    }
}