public class encapsulation {
    //Encapsulation: attributes are private, methods are public
    //Private attributes can only be accessed through public methods
    //This is a way to protect the data and hide the implementation details
    //So, encapsulation is a way to restrict direct access to attributes, while providing public methods to access and modify them.
    public static void main(String[] args){
        encap_car myCar = new encap_car("BMW", "Black", 2020);
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getYear());
    }

}
