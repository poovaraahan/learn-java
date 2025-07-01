import java.util.Random;
public class DiceRoller {
    // global variable = variable declared outside any method, constructor or block
    // visible to all methods, constructors and blocks in the class
    
    Random random; // creating an instance of the Random class
    int number;
    DiceRoller() {
        random = new Random();// initializing the random instance
        roll(); // calling the method roll declared below
    }

    void roll() {
        number = random.nextInt(6) + 1; // generates a random number between 1 and 6
        System.out.println("You rolled a " + number);
    }
}

//ISSUE:
//The instance of the random class, and the variable number are local and visible only within the constructor DiceRoller.
//roll method does not have access to the variable or instance of the random class.
