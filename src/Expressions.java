public class Expressions {
    public static void main(String[] args){
        //expressions: operands + operators
        //values, variables, and constants are operands
        //operators : // +, -, *, /, %, ++, --, ==, !=, >, <, >=, <=, &&, ||, !
       
        //addition and increment operator
        int friends = 10; //int variable
        friends = friends + 1; //incrementing the variable by 1
        System.out.println("I have " + friends + " friends!");
        friends += 5; //shorthand for friends = friends + 5
        System.out.println("I have " + friends + " friends!");
        
        //subtraction operator
        friends = friends - 1; //subtracting 1 from the variable
        System.out.println("I have " + friends + " friends!"); 
        
        //multiplication operator
        friends = friends*2; //multiply by 2
        System.out.println("I have " + friends + " friends!");
       
        //division operator
         friends = friends/3; //division operator
        System.out.println("I have " + friends + " friends!");
        //note that the division operator will return the nearest lesser integer value.
        //Use double for more precision
        
        //modulus operator
        friends= friends%4; //modulus operator
        System.out.println("I have " + friends + " friends!");//returns remainder of 10/4

    }


   

    
}
