public class String_methods {
    public static void main(String[] args) {
        //String is a reference datatype that is used to store a sequence of characters.
        //can access useful methods
        String str = "Hello, World!";
        boolean result = str.equalsIgnoreCase("hello, world!");// Compares two strings, ignoring case considerations. 
        System.out.println(result);
        boolean result2 = str.isEmpty();// Checks if the string is empty.
        System.out.println(result2);
        boolean result3 = str.contains("World");// Checks if the string contains a substring.
        System.out.println(result3);
        boolean result4 = str.startsWith("Hello");// Checks if the string starts with a prefix.
        System.out.println(result4);
        boolean result5 = str.endsWith("!");// Checks if the string ends with a suffix.
        System.out.println(result5);

    }
}