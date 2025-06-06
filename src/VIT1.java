import java.util.Scanner;
/*
Question No: 5
Single File Programming Question
Problem Statement



Akash is tasked with developing a program that calculates and categorizes blood pressure based on the given systolic and diastolic readings. 



The program should use the following classifications:

Low Blood Pressure: Systolic < 90 mm Hg or Diastolic < 60 mm Hg
Normal Blood Pressure: Systolic ≤ 120 mm Hg and Diastolic ≤ 80 mm Hg
Prehypertension: Systolic ≤ 140 mm Hg and Diastolic ≤ 90 mm Hg
Stage 1 Hypertension: Systolic ≤ 160 mm Hg and Diastolic ≤ 100 mm Hg
Stage 2 Hypertension: Otherwise


Write a program to assist Akash in computing and classifying blood pressure levels based on input readings. The program should use a 'switch-case' to deliver a tailored blood pressure category.

Input format :
The input consists of two space-separated integers, representing the systolic blood pressure value S and diastolic blood pressure value D, respectively.

Output format :
The output displays "Blood Pressure Category: " followed by the blood pressure category based on the provided input.



Refer to the sample output for the exact text and format.

Code constraints :
50 ≤ S, D ≤ 170

Sample test cases :
Input 1 :
50 85
Output 1 :
Blood Pressure Category: Low Blood Pressure
Input 2 :
112 70
Output 2 :
Blood Pressure Category: Normal Blood Pressure
Input 3 :
135 86
Output 3 :
Blood Pressure Category: Prehypertension
Input 4 :
145 98
Output 4 :
Blood Pressure Category: Stage 1 Hypertension
Input 5 :
170 110
Output 5 :
Blood Pressure Category: Stage 2 Hypertension
*/
public class VIT1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s,d;
        s = input.nextInt();
        d = input.nextInt();
        input.close();
        if(s<90||d<60){
            System.out.println("Blood pressure Category: Low Blood Pressure");
        }
        else if(s<=120||d<=80){
            System.out.println("Blood pressure Category: Normal Blood Pressure");
        }
        else if(s<=140||d<=90){
            System.out.println("Blood pressure Category: Prehypertension");
        }
        else if(s<=160||d<=100){
            System.out.println("Blood pressure Category: Stage 1 Hypertension");
        }
        else{
            System.out.println("Blood pressure Category: Stage 2 Hypertension");
        }
        
    }
}
/*Expexted output employs switch cases. revisit required
import java.util.Scanner;

class BloodPressureCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int systolic = scanner.nextInt();
        int diastolic = scanner.nextInt();

        int pulsePressure = systolic - diastolic;

        int category;
        if (systolic < 90 || diastolic < 60) {
            category = 1;
        } else if (systolic <= 120 && diastolic <= 80) {
            category = 2;
        } else if (systolic <= 140 && diastolic <= 90) {
            category = 3;
        } else if (systolic <= 160 && diastolic <= 100) {
            category = 4;
        } else {
            category = 5;
        }

        System.out.print("Blood Pressure Category: ");

        switch (category) {
            case 1:
                System.out.println("Low Blood Pressure");
                break;
            case 2:
                System.out.println("Normal Blood Pressure");
                break;
            case 3:
                System.out.println("Prehypertension");
                break;
            case 4:
                System.out.println("Stage 1 Hypertension");
                break;
            case 5:
                System.out.println("Stage 2 Hypertension");
                break;
            
        }

        scanner.close();
    }
}
 */