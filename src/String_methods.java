public class String_methods {
    public static void main(String[] args) {
        //String is a reference datatype that is used to store a sequence of characters.
        //can access useful methods
        String str = "Hello, World!";
        int length = str.length(); // Returns the length of the string
        System.out.println(length);
        char letter = str.charAt(12); // Returns the character at index 12
        System.out.println(letter);
        int index = str.indexOf("W"); // Returns the index of the first occurrence of "W"
        System.out.println(index);
    }
}