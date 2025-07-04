package package1;
public class b{
    private String privateMessage = "Private Access Modifier"; // This variable is accessible only within this class
    public static void main(String[] args) {
        b newB = new b();
        System.out.println(newB.privateMessage); // This will cause an error because privateMessage is not accessible here
    }
}