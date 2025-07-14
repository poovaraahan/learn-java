package polymorphism;

public class bike extends vehicle {
    @Override
    public void accelerate() {
        System.out.println("The bike goes grr!");
    }
    @Override
    public void brake() {
        System.out.println("The bike goes screech!");
    }

}
