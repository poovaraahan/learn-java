public class Expressions {
    public static void main(String[] args){
        //expressions: operands + operators
        //values, variables, and constants are operands
        //operators : // +, -, *, /, %, ++, --, ==, !=, >, <, >=, <=, &&, ||, !
        int friends = 10; //int variable
        friends = friends - 1; //subtracting 1 from the variable
        System.out.println("I have " + friends + " friends!"); 
        friends --; //decrementing the variable by 1
        System.out.println("Now I have " + friends + " friends!");
        //note that the variable is updated in each line. 
    }
}
