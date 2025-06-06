public class Maths {
    public static void main(String[] args) {
        double x = -10;
        double y = 3.14;
        double z = Math.ceil(y); // Round up to the nearest greater integer
        System.out.println("The nearest greater integer value of y is " + z);
        double w = Math.floor(y); // Round down to the nearest lesser integer
        System.out.println("The nearest lesser integer value of y is " + w);
    }
}
