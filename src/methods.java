public class methods {
    public static void main(String[] args){
        //A  method is a block of code executed when called within the main function
        //Basically functions like the python def function
        String name = "Bonobo";
        int age = 666;
        hello(name, age);
        //Variables being declared in the main function must also be declared as parameters within the methods
        
    }
    static void hello(String name, int age){//declare variable parameter with datatype
        System.out.println("homiesexual " + name+". I am "+age+" years old");
    }
}
