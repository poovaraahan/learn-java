public class myInfo {
    String name = "Poovaraahan";
    int age = 19;
    String country = "India";
    String language = "Tamil";
    int height = 170; 
    int weight = 65;
    public String toString() {
        String myString = name+"\n"+age+"\n"+country+"\n"+language+"\n"+height+"\n"+weight;
        return myString;
        /*
         * OR
         * return name+"\n"+age+"\n"+country+"\n"+language+"\n"+height+"\n"+weight;
         */
    }
}