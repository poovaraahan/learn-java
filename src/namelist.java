public class namelist {
    String name;
    static int numberOfStudents;// static variable to keep track of the number of students
    namelist(String name) {
        this.name = name;
        numberOfStudents++;// Increment the static variable each time a new instance is created
    }
    
}
