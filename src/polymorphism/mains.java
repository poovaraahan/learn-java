package polymorphism;

public class mains {
    public static void main(String[] args) {
        // Example usage of polymorphism
        car myCar = new car();
        bike myBike = new bike();
        boat myBoat = new boat();
        vehicle[] racers = {myCar, myBike, myBoat};// Array of vehicle type, though it contains different types of vehicles
        for(vehicle x : racers) {// Loop through each vehicle in the array
            // Call the accelerate and brake methods on each vehicle
            x.accelerate();
            x.brake();
        }
    }
    
}
//Polymorphism: Ability of object to identify as more than one type
//During inheritance, the type of class is exchanged with the type of parent class, and vice versa.
//This allows us to use the same method name for different classes, and the correct method will be called based on the object type at runtime.
