import java.util.Scanner;
public class VIT2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int arr[][] = new int[r][c];
        
        // Read the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        int x = input.nextInt(); // Read the cutoff age
        int count = 0;
        
        // Calculate row averages and count those > x
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            double average = (double) sum / c;
            if (average > x) {
                count++;
            }
        }
        
        System.out.println(count);
        input.close();
    }
}
/*
 * 
The Pan Am 73 flight from Bombay to New York, en route to Karachi and Frankfurt, was hijacked by a few Palestinian terrorists at the Karachi International Airport. The senior flight purser, Neerja Banhot, withered her fear and helped evacuate the passengers on board.

Neerja planned to evacuate the passengers in rows that had an average age greater than x. Given r is the number of rows, c is the number of columns, and a list of integers representing the ages of passengers, can you find the number of rows with an average age greater than x?

Input format :
The first line of input consists of an integer r, corresponding to the number of rows of seats in the aircraft.

The second line of input consists of an integer c, corresponding to the number of seats in a row.

The third line of input consists of a collection of integers that correspond to the ages of passengers.

The fourth line of input is an integer x corresponding to the cut-off age.

Output format :
The output displays an integer corresponding to t, the number of rows with an average age greater than x.



Refer to the sample input and output for format specifications.

Code constraints :
1 ≤ r ≤ 100

1 ≤ c ≤ 100

0 ≤ cut-off age ≤ 100.

Sample test cases :
Input 1 :
4
5
23 34 45 56 67
98 78 65 78 90
85 76 98 1 2
5 6 7 8 9
25
 */