public class super_k {
    public static void main(String[] args) {
        // Super keyword: used to refer to the immediate parent class object
        // It can be used to access parent class methods, constructors, and variables.
        hero hero1 = new hero("Spiderman", 25, "Web-slinging");
        hero hero2 = new hero("Batman", 35, "Stealth");
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        // It returns the name and age from the parent class and appends the power from the child class
    }
}
