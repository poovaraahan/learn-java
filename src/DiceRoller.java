import java.util.Random;
public class DiceRoller {
    // local variable = variable declared inside a method, constructor or block
    // visible only within that method, constructor or block
    // global variable = variable declared outside any method, constructor or block
    // visible to all methods, constructors and blocks in the class


    DiceRoller() {
        Random random = new Random(); // creating an instance of the Random class
        int number = 0;
        roll(random, number); // calling the method roll declared below
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1; // generates a random number between 1 and 6
        System.out.println("You rolled a " + number);
    }
}

//ISSUE:
//The instance of the random class, and the variable number are local and visible only within the constructor DiceRoller.
//roll method does not have access to the variable or instance of the random class.
