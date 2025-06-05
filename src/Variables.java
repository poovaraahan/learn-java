public class Variables {
    public static void main(String[] args){
        //Integer variables
        int x; // Declaration
        x = 10; // Assignment
        int y = 20; // Initialization = Declaration + Assignment
        System.out.println("Integer value: " + x +y);//function to print variable
        //Long Variables
        long a = 999999999999999999L; //can store large integers, L in the end necessary to indicate it's a long literal
        System.out.println("Long value: " + a);// This will print the long value
        //byte and short
        byte b = 100; // 1 byte. range = -128 to 127
        short s = 10000; // 2 bytes. range = -32,768 to 32,767
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        //float and double
        float f = 3.14159129f; // float variable: prints up to 7 decimal places. f necessary
        System.out.println("Float value: " + f); // Print float value
        double d = 3.1415926535897937; // double variable: prints up to 15 decimal places
        System.out.println("Double value: " + d); // Print double value
        //Boolean 
        boolean isJavaFun = true;// Boolean variable, one byte
        //Character and String
        char grade = 'A';// Character variable, any single character, two bytes
        String greeting = "Hello, World!"; //String variable, sequence of characters
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Grade: " + grade);
        System.out.println(greeting);
        //Swapping two variables
        String p = "Pikachu";
        String q = "Piplup";
        System.out.println("Before swapping: p = " + p + ", q = " + q);
        /*p = q;
        System.out.println("If we assign p = q, then p = " + p + ", q = " + q);
        q = p;
        System.out.println("If we assign q = p, then p = " + p + ", q = " + q);
        */
        String temp = null;
        temp = p;
        p = q;
        q = temp;
        System.out.println("After swapping: p = " + p + ", q = " + q);
    }
}