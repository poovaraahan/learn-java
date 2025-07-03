public class hero extends human {
    String power;
    hero(String name, int age, String power) {
        super(name, age); // calling the constructor of the parent class human
        // super keyword is used to refer to the immediate parent class object
        // It can be used to access parent class methods, constructors, and variables.
        // It is used to avoid name conflicts when the parent class and child class have same variables
        this.power = power;
        
    }
    public String toString(){
        return super.toString()+this.power; // calling the toString method of the parent class human
        // It returns the name and age from the parent class and appends the power from the child class
    }
}/*
Basically, allows to inherit properties and methods from the parent class human
while adding new properties and methods specific to the hero class.

 */
