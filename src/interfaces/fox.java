package interfaces;

public class fox implements predator, prey {
    @Override
    public void hunt() {
        // Implementation of hunting logic
        System.out.println("Fox is hunting the prey.");
    }

    @Override
    public void flee() {
        // Implementation of fleeing logic
        System.out.println("Fox is fleeing from danger.");
    }
    
}
