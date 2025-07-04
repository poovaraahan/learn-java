package package1;
import package2.*;
public class b{
    public static void main(String[] args){
        a newA = new a();
        System.out.println(newA.protectedMessage);
        //No error here because protectedMessage is accessible within the same package
    }

}