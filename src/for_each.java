import java.util.ArrayList;
public class for_each {
    public static void main(String[] args){
            //Traverse through the elements of an array or arraylist
            //less steps, more readable
            //less flexible - also known as enhanced for loop
            ArrayList<String> pokemon = new ArrayList<String>();
            pokemon.add("pikachu");
            pokemon.add("bulbasaur");
            pokemon.add("charmander");
            pokemon.add("squirtle");
            for(String i : pokemon){
                System.out.println(i);
            }

    }
    
}
