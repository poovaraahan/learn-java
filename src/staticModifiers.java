public class staticModifiers {
    //Static = modifier : A single copy of the variable is shared among all instances of the class.    
    // Class owns the static variable, not the instance.
    public static void main(String[] args){
        namelist student1 = new namelist("Poovaraahan");
        namelist student2 = new namelist("Srihari");
        namelist student3 = new namelist("Sujan");
        namelist.displayStudentCount(); // Display the total number of students created
        //static methods can be called without creating an instance of the class
        /*
         * Basically, when u want to access a method or a variable without having to create a new instance of the class
         * every single time... static methods and variables are used.
         * U dont want to execute:
         *  Math math = new Math();
         * every time u want to use a method from the Math class, u can just use 
         * Math.methodName();
         * if the method is static, it shall be executed regardless of whether an instance of the class is created or not.
         */
    }

}
