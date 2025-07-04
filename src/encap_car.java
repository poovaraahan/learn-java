public class encap_car {
    //Encapsulation: declaration as all private attributes
    private String model;
    private String color;
    private int year;

    //Constructor:
    encap_car(String model, String color, int year){
        this.setModel(model);//Using the set methods to initialize the attributes
        this.setColor(color);
        this.setYear(year);
    }
    //Copy constructor: Overloaded constructor that takes another encap_car object as a parameter
    encap_car(encap_car x) {
        //Copy constructor: initializes the attributes using another encap_car object
        this.copy(x);
    }
    //As you know, private attributes cannot be accessed directly outside the class.
    //So, we provide public methods to access and modify them.
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    //setVariables methods to modify the private attributes
    //These methods allow us to change the values of the private attributes, outside the class.
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void copy(encap_car car) {
        //Copy method to copy the attributes of another encap_car object
        this.setModel(car.getModel());
        /*
         * car.getModel() → gets the model from the car object passed in.
         * this.setModel(...) → sets the model of the current object.
         * The value from car is assigned to the current object.
         */
        this.setColor(car.getColor());
        this.setYear(car.getYear());
    }
}
