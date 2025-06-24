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
        // myPokemon = instance name 
        // .method(parameters)/.variable attribute = syntax to import the var/meth from parent class

    }
}
