public class String_methods {
    public static void main(String[] args) {
        //String is a reference datatype that is used to store a sequence of characters.
        //can access useful methods
        String str = "  Hello, World!";
        String str2 = str.toLowerCase(); // Converts the string to lowercase
        String str3 = str .toUpperCase(); // Converts the string to uppercase
        String str4 = str.trim(); // Removes leading and trailing whitespace
        String str5 = str.replace("World", "Java"); // Replaces "World" with "Java"
        String str6 = str.substring(2, 6); // Extracts a substring from index 2 to 5 (exclusive)
        String str7 = str.concat(" How are you?"); // Concatenates another string
        System.out.println("Original String: " + str);
        System.out.println("Lowercase: " + str2);
        System.out.println("Uppercase: " + str3);
        System.out.println("Trimmed: " + str4);
        System.out.println("Replaced: " + str5);
        System.out.println("Substring: " + str6);
        System.out.println("Concatenated: " + str7);
    }
}