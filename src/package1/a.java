package package1;
import package2.*;
public class a {
    public static void main(String[] args){
        c classC = new c();
        System.out.println(classC.publicMessage);
        //No error here because publicMessage is accessible everywhere
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