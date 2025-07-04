package package2;
import package1.*;

public class c {
    String defaultMessage = "Default Access Modifier";// This variable is accessible only within the same package
    public String publicMessage = "Public Access Modifier"; // This variable is accessible everywhere
    public static void main(String[] args){
        c newC = new c();
        System.out.println(newC.protectedMessage);
        //Error here because protectedMessage is not accessible in this class...
        //c is not a subclass of a and is not in the same package as a
    }
}
