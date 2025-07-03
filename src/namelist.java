public class namelist {
    String name;
    static int numberOfStudents;// static variable to keep track of the number of students
    namelist(String name) {
        this.name = name;
        numberOfStudents++;// Increment the static variable each time a new instance is created
    }
    static void displayStudentCount() {// static method to display the total number of students
        System.out.println("Total number of students: " + numberOfStudents);
    }
    /*
     * Declared with the static keyword

Can be called using the class name (ClassName.methodName())

Cannot access non-static (instance) variables or methods directly

Can only directly call other static methods

Can only directly access static data

Limitations

Cannot be overridden (though they can be hidden)

Cannot access instance members directly

Can make code less flexible for testing (harder to mock)

When to Use Static Methods

For operations that don't depend on instance variables

For pure functions (output depends only on input parameters)

For utility methods that perform general functions

For factory methods that create instances
     */
}
