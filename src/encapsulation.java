public class encapsulation {
    public static void main(String[] args) {
        encap_car myCar = new encap_car("BMW", "Black", 2020);
        encap_car myCar2 = new encap_car(myCar);
        
        //Print Addresses of the objects
        System.out.println(myCar);
        System.out.println(myCar2+"\n");
        //Printing the attributes of myCar using the get methods
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getYear() + "\n");
        //Printing the attributes of myCar2 using the get methods
        System.out.println(myCar2.getModel());
        System.out.println(myCar2.getColor());
        System.out.println(myCar2.getYear() + "\n");
        /*
         * In this example, equating myCar2 to myCar does not create a new object.
         * Instead, it makes myCar2 refer to the same object as myCar.
         * The addresses of both objects will be the same.
         */

        
    }

}
