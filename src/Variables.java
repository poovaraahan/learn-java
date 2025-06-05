public class Variables {
    public static void main(String[] args){
        //Swapping two variables
        String p = "Pikachu";
        String q = "Piplup";
        System.out.println("Before swapping: p = " + p + ", q = " + q);
        p = q;
        System.out.println("If we assign p = q, then p = " + p + ", q = " + q);
        q = p;
        System.out.println("If we assign q = p, then p = " + p + ", q = " + q);
        String temp = null;
        temp = p;
        p = q;
        q = temp;
        System.out.println("After swapping: p = " + p + ", q = " + q);
    }
}