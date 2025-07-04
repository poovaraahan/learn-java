public class abstract_k {
    //An abstract class can't be instantiated, but can have subclasses.
    //That is, you cannot create an instance or object of an abstract class...You can only create an instance of a subclass that extends the abstract class.
    //Abstract methods are declared without body or implementation possibly within the abstract class.
    //These methods must be compulsarily overridden in all of its subclasses
    public static void main(String[] args) {
        //abs_animal = new abs_animal(); // This line would cause an error because abs_animal is abstract and cannot be instantiated
        // Create an instance of abs_cat
        abs_cat cat = new abs_cat();
        // Call the makeSound method
        cat.makeSound();
        // Call the eat method from the abstract class
        cat.eat();
    }

}
