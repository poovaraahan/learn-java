public class Inheritance {
    public static void main(String[] args){
        //Inheritance: aquiring the attributes and methods of another class
        //In Java, inheritance is implemented using the 'extends' keyword.
        car myCar = new car();
        myCar.go(); // calling the method from the parent class vehicle
        bike myBike = new bike();
        myBike.stop(); // calling the method from the parent class vehicle
        System.out.println("My car speed is: " + myCar.speed);
        System.out.println("My bike speed is: " + myBike.speed);
        System.out.println("My car has " + myCar.wheels + " wheels and " + myCar.doors + " doors.");
        System.out.println("My bike has " + myBike.wheels + " wheels and " + myBike.pedals + " pedals.");
    }
}
