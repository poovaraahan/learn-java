import java.util.Scanner;
/*Problem Statement



Sharon's favourite cricket team, "Kings XI Punjab" is participating in the IPL season. She wants to check the zodiac signs of the players based on their dates of birth. To do this, Sharon needs to use a zodiac sign chart that provides the zodiac sign for each date of birth.



Manish, Sharon's assistant, is assigned to write a program that will determine the zodiac sign based on the given date. 



Help Manish by creating a program that takes a date of birth and outputs the corresponding zodiac sign according to the following chart:



Input format :
The input consists of two space-separated integers, representing the date and month.

Output format :
The output prints the astrological sign corresponding to the given date and month.

If the date or month is above the valid range, print "Invalid Date/Month".



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ date ≤ 31

1 ≤ month ≤ 12

Sample test cases :
Input 1 :
7 8
Output 1 :
Astrological sign for 7-8 is Leo
Input 2 :
18 2
Output 2 :
Astrological sign for 18-2 is Aquarius
Input 3 :
35 7
Output 3 :
Invalid Date/Month */

public class VIT1{public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int date, month;
        date = input.nextInt();
        month = input.nextInt();
        if(date<1||date>31||month<1||month>12){
            System.out.println("Invalid Date/Month");
        }
        else{
            String sign = null;
            int category = 0;//have to initialize it seems
            if((month == 1 && date>=20) || (month == 2 && date<=18)){ //if((date>=20&&date<=18) && (month=1||month=2)) my initial wrong proposal. This condition will never be true because a number cannot be both >= 20 and <= 18 at the same time.
                category = 1;//I keep forgetting == within conditionals
            }
            else if((month==2 && date>=19)||(month == 3 && date<=20)){
                category = 2;
            }
            else if((month==3 && date>=21)||(month == 4 && date<=19)){
                category = 3;
            }
            else if((month==4 && date>=20)||(month==5 && date<=20)){
                category = 4;
            }
            else if((month==5 && date>=21)||(month==6 && date<=20)){
                category = 5;
            }
            else if((month==6 && date>=21)||(month==7 && date<=22)){
                category = 6;
            }
            else if((month==7 && date>=23)||(month==8 && date<=22)){
                category = 7;
            }
            else if((month==8 && date>=23)||(month==9 && date<=22)){
                category = 8;
            }
            else if((month==9 && date>=23)||(month==10 && date<=22)){
                category = 9;
            }
            else if((month==10 && date>=23)||(month==11 && date<=21)){
                category = 10;
            }
            else if((month==11 && date>=22)||(month==12 && date<=22)){
                category = 11;
            }
            else{
                category = 12;
            }
            switch(category){
                case 1:
                   sign = "Aquarius"; 
                   break;//I have to remember break;
                case 2:
                    sign = "Pisces";
                    break;
                case 3:
                    sign = "Aries";
                    break;
                case 4:
                    sign = "Taurus";
                    break;
                case 5:
                    sign = "Gemini";
                    break;
                case 6:
                    sign = "Cancer";
                    break;
                case 7:
                    sign = "Leo";
                    break;
                case 8:
                    sign = "Virgo";
                    break;
                case 9:
                    sign = "Libra";
                    break;
                case 10:
                    sign = "Scorpio";
                    break;
                case 11:
                    sign = "Saggitarius";
                    break;
                case 12:
                    sign = "Capricorn";
                    break;
            }
            System.out.printf("Astrological sign for %d-%d is %s", date, month, sign);
        }
        input.close();
        //I have to remember to close the scanner to avoid resource leaks
        
        
    }
}