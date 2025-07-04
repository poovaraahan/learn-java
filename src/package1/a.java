package package1;
import package2.*;
public class a {
    protected String protectedMessage = "Protected Access Modifier"; // This variable is accessible within the same package and subclasses
    public static void main(String[] args) {
        b newB = new b();
        System.out.println(newB.privateMessage); // This will cause an error because privateMessage is not accessible here
    }
}
//Access Modifiers
/*
 * public: Accessible everywhere
 * protected: Accessible within the same package and subclasses
 * default: Accessible only within the same package
 * private: Accessible only within the same class
 *
 * Basically deals with visibility and access control of classes, methods, and variables.
 */