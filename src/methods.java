public class methods {
    public static void main(String[] args){
        //A  method is a block of code executed when called within the main function
        //Basically functions like the python def function
        int a = 5;
        int b = 7;
        //Note that return doesn't automatically print the value, it can only store the value to its memory
        int c = add(a,b);//c in the main function and the method are independent of each other -local variable
        System.out.println(c); 
        //OR System.out.println(add(a,b));     
    }
    static int add(int a, int b){
        int c = a + b;
        return c;
        //OR return a+b;
    }
}
