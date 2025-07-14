package polymorphism;

public class boat extends vehicle {
    @Override
    public void accelerate() {
        System.out.println("The boat goes whoosh!");
    }

    @Override
    public void brake() {
        System.out.println("The boat goes splash!");
    }
    
}
