public class Array {
    public static void main(String[] args){
        // Create a simple array of Strings
        String[] pokemon = new String[6];
        pokemon[0] = "Pikachu"; 
        pokemon[1] = "Bulbasaur";
        pokemon[2] = "Charmander";
        pokemon[3] = "Squirtle";
        pokemon[4] = "Jigglypuff";
        pokemon[5] = "Meowth";
        for(int i = 0; i < pokemon.length; i++) {
            System.out.println(pokemon[i]);
        }
        //Prints the entire array
    }
    
}
