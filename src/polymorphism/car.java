package polymorphism;

public class car extends vehicle {
    @Override
    public void accelerate() {
        System.out.println("The car goes vroom!");
    }

    @Override
    public void brake() {
        System.out.println("The car goes brrr!");
    }
}
