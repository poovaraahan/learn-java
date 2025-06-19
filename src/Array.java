public class Array {
    public static void main(String[] args){
        //Create 2D array: Array of Arrays
        String[][] alphabet = new String[3][3];
        alphabet[0][0] = "A";
        alphabet[0][1] = "B";
        alphabet[0][2] = "C";
        alphabet[1][0] = "D";
        alphabet[1][1] = "E";
        alphabet[1][2] = "F";
        alphabet[2][0] = "G";
        alphabet[2][1] = "H";
        alphabet[2][2] = "I";
        /*
         * OR
         * String[][] alphabet = {
         * {"A", "B", "C"},
         * {"D", "E", "F"},   
         * {"G", "H", "I"}
         */
        //Use nested for loop to print the 2D array
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(); // New line before each row
            for (int j = 0; j < alphabet[i].length; j++) {// Loop through each column in the row
                System.out.print(alphabet[i][j] + " ");// " " for space between elements of each column
            }//don't forget to add alphabet[i].length to the for inner loop condition

        }
    }
}

