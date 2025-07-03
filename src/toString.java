public class toString {
    public static void main(String[] args) {
        //toString() method is a method that all objects inherit
        //returns a textual representation of the object
        //can be used both implicitly and explicitly
        myInfo Poovaraahan = new myInfo();
        System.out.println(Poovaraahan.toString());
        //or simply
        // System.out.println(Poovaraahan);
        
        //toString() method can be overridden to provide a custom string representation of the object
        //This is done by defining a method with the same name and return type in the class
        //This is useful for debugging and logging purposes, as it allows you to print all attributes of the object using one call
    }
    
}
