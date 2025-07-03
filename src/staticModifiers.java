public class staticModifiers {
    //Static = modifier : A single copy of the variable is shared among all instances of the class.    
    // Class owns the static variable, not the instance.
    public static void main(String[] args){
        namelist student1 = new namelist("Poovaraahan");
        namelist student2 = new namelist("Srihari");
        namelist student3 = new namelist("Sujan");
        System.out.println(namelist.numberOfStudents);
        //The static variable numberOfStudents is shared among all instances of the namelist class.
        //It keeps track of the total number of students created.
    }

}
