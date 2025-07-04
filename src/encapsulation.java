public class encapsulation {
    //Encapsulation: attributes are private, methods are public
    //Private attributes can only be accessed through public methods
    //This is a way to protect the data and hide the implementation details
    //So, encapsulation is a way to restrict direct access to attributes, while providing public methods to access and modify them.
    public static void main(String[] args){
        encap_car myCar = new encap_car("BMW", "Black", 2020);
        System.out.println("Before modification:");
        //Using the get methods to access the attributes
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getYear());
        //Using the set methods to modify the attributes
        myCar.setModel("Audi");
        myCar.setColor("Red");
        myCar.setYear(2021);
        //Printing the modified attributes
        System.out.println("After modification:");
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getYear());
    }

}
