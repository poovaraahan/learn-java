public class OOP {
    public static void main(String[] args) {
        // objects = attributes + methods -> basically a unique instance of the class
        // attributes = properties/characteristics of the object
        // methods = potential actions performed by the object.
        Pokemon myPokemon = new Pokemon(); // created an instance for the class Pokemon
        // To display the attributes of a class, or to execute the methods from the class-- Use object_name.attribute/method
        System.out.println(myPokemon.name);
        System.out.println(myPokemon.type);
        System.out.println(myPokemon.generation);
        System.out.println(myPokemon.weight);
        myPokemon.thunderbolt();
        myPokemon.electroball();
        // CREATING ANOTHER INSTANCE FOR THE SAME CLASS
        Pokemon myPokemon2 = new Pokemon(); // created an instance for the class Pokemon 
        System.out.println(myPokemon2.name);
        System.out.println(myPokemon2.type);
        System.out.println(myPokemon2.generation);
        System.out.println(myPokemon2.weight);
        myPokemon2.thunderbolt();
        myPokemon2.electroball();
        //Notice that the same block of code is executed twice as they inherit from the same blueprint or class
        
    }
}
