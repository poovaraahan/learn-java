package package1;
import package2.*;
public class a {
    public static void main(String[] args){
        c classC = new c();
        System.out.println(classC.defaultMessage);
        //Compilation Error: 
        //defaultMessage has default access in package2.c and cannot be accessed from outside its package
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