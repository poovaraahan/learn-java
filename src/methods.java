public class methods {
    public static void main(String[] args){
        //Method signature: No.of parameters||Datatype of parameters||Name of the method
        //Overloaded methods: Methods of the same name defined for a varying set of parameters over and over again
    System.out.println(add(1,8));
    System.out.println(add(1,8,9));
    System.out.println(add(1.9,2.7,5.7));
    String a = "Poo";
    String b = "varaahan";
    add(a,b);

    }
    static int add(int a, int b){
        System.out.println("Overloaded method 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Overloaded method 2");
        return a+b+c;
    }
    static double add(double a, double b, double c){
        System.out.println("Overloaded method 3");
        return a+b+c;
    }
    static void add(String a, String b) {
        System.out.println("Overloaded method 4");
        String c = a + b;
        System.out.println(c);
    }


}
