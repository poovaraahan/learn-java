public class abs_cat extends abs_animal {
    // Concrete class that extends the abstract class abs_animal
    // It must implement the abstract method makeSound... or will cause a compilation error
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
