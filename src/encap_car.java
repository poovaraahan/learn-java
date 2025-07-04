public class encap_car {
    //Encapsulation: declaration as all private attributes
    private String model;
    private String color;
    private int year;

    //Constructor:
    encap_car(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
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
}
