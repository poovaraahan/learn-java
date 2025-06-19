public class Wrapper_class {
    public static void main(String args[]){
        //wrapper class provides a way to use primitive datatypes as reference datatypes
        //Reference datatypes can make use of methods, and takes slightly more processing
        //can be used with collections like ArrayList
        /*
         * Primitive Syntax    	Wrapper Syntax
             int x = 5;	          Integer x = 5;
             char c = 'a';	      Character c = 'a';
             double d = 2.5;	  Double d = 2.5;
             boolean a = true;	  Boolean a = true;
         */
        // Autoboxing
        int num = 5;
        Integer obj = num; // int to Integer
        // Unboxing
        Integer obj2 = 10;
        int num2 = obj2; // Integer to int
        //Automatic conversions of primitive to wrapper class and vice versa
        System.out.println(obj);
        System.out.println(num2);
        obj = Integer.parseInt("123");//example method for Integer class
        System.out.println(obj);


    }
    
}
/*
 
Integer Methods:

 // Parsing a String to int
int num = Integer.parseInt("123");

// Converting int to String
String s = Integer.toString(456);

// Getting the maximum of two ints
int max = Integer.max(10, 20);

// Comparing two Integers
int cmp = Integer.compare(5, 8);

// Getting Integer value from String (returns Integer object)
Integer obj = Integer.valueOf("789");

// Getting int value from Integer object
int val = obj.intValue();

// Getting binary, octal, or hex string representation
String bin = Integer.toBinaryString(10);   // "1010"
String oct = Integer.toOctalString(10);    // "12"
String hex = Integer.toHexString(10);      // "a"

Boolean Methods:

// Parsing a String to boolean
boolean b1 = Boolean.parseBoolean("true");

// Getting Boolean object from String
Boolean b2 = Boolean.valueOf("false");

// Converting Boolean to String
String s = Boolean.toString(true);

// Comparing two Booleans
int cmp = Boolean.compare(true, false);

// Getting boolean value from Boolean object
boolean val = b2.booleanValue();

Character Methods:

// Check if a character is a digit
boolean isDigit = Character.isDigit('5');

// Check if a character is a letter
boolean isLetter = Character.isLetter('A');

// Check if a character is uppercase
boolean isUpper = Character.isUpperCase('X');

// Check if a character is lowercase
boolean isLower = Character.isLowerCase('x');

// Convert to uppercase
char upper = Character.toUpperCase('a');

// Convert to lowercase
char lower = Character.toLowerCase('A');

// Check if a character is whitespace
boolean isSpace = Character.isWhitespace(' ');

Double Methods:

// Parsing a String to double
double d1 = Double.parseDouble("3.14");

// Getting Double object from String
Double d2 = Double.valueOf("2.718");

// Converting Double to String
String s = Double.toString(1.618);

// Comparing two Doubles
int cmp = Double.compare(1.5, 2.5);

// Getting double value from Double object
double val = d2.doubleValue();

// Checking if value is NaN or infinite
boolean isNan = Double.isNaN(d1);
boolean isInf = Double.isInfinite(d1);

*/