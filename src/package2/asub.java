package package2;
import package1.*;
public class asub extends a{
    public static void main(String[] args){
        asub newAsub = new asub();
        System.out.println(newAsub.protectedMessage);
        //No error here because protectedMessage is accessible within the same package and subclasses
        c newC = new c();//Creating an instance of class c from package2
        //Accessing public and default messages from class c
        System.out.println(newC.publicMessage);
        System.out.println(newC.defaultMessage);
  }

}

