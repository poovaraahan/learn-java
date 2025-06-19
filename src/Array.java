import java.util.ArrayList;
public class Array {
    public static void main(String[] args){
        //Array list is a resizable array implementation in Java
        //Elements can be added or removed after compilation
        //store referece data types
        ArrayList<String>pokemon = new ArrayList<String>();//() is used to create an object
        pokemon.add("Pikachu");
        pokemon.add("Bulbasaur");
        pokemon.add("Charmander");
        pokemon.add("Squirtle");
        for(int i = 0; i < pokemon.size(); i++) {//used size() instead of length
            System.out.println(pokemon.get(i));//get() is used to access elements in an ArrayList
        }
        
    }
}

