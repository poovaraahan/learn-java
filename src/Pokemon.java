public class Pokemon {
    // Attributes declared for the class Pokemon
    String name;
    String type;
    int generation;
    double weight;
    
    //CONSTRUCTOR: A method called when new instance/onject derived from class

    Pokemon(String name, String type, int generation, double weight){ //Parameters
        this.name = name;
        this.type = type;
        this.generation = generation;
        this.weight = weight;
    }
    //It is the syntax to assing the values appropriated for each object
    //this.attribute = parameter
    //name (without this.) refers to the parameter passed to the constructor.
    //Parameter: Temporary variable used to pass a value into a method or constructor 
}