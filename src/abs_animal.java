public abstract class abs_animal {
    // Abstract class
    // It cannot be instantiated, but can have subclasses
    // It can have abstract methods that must be implemented in subclasses

    public abstract void makeSound(); // Abstract method, no body

    public void eat() { // Concrete method, has body
        System.out.println("This animal eats food.");
    }

    
}
