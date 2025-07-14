package interfaces;

public class general {
    public static void main(String[] args) {
        // Example usage of the GeneralInterface
        hare hare = new hare();
        wolf wolf = new wolf(); 
        hare.flee(); // Hare flees from danger
        wolf.hunt(); // Wolf hunts for prey 
        fox fox = new fox();
        fox.hunt(); // Fox hunts the prey       
        fox.flee(); // Fox flees from danger
    }
}

//Interface: It is a contract that defines a set of methods that a class must implement. 
//It does not provide any implementation details, only method signatures. 
//Classes that implement an interface must provide concrete implementations for all the methods defined in the interface.
//It's basically inheritance but can inherit from multiple interfaces.