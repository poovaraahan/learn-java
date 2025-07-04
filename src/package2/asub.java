package package2;
import package1.*;
public class asub extends a{
    public static void main(String[] args){
        asub newAsub = new asub();
        System.out.println(newAsub.protectedMessage);
        //No error here because protectedMessage is accessible for subclasses
    }
}

