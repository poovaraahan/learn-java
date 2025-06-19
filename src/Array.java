import java.util.ArrayList;
public class Array {
    public static void main(String[] args){
        /*
         * Here’s a quick comparison between Array and ArrayList in Java:

Feature	    Array	                     ArrayList
Size	    Fixed(set at creation)	     Dynamic (can grow/shrink)
Syntax	    int[] arr = new int[5];	     ArrayList<Integer> list = new ArrayList<>();
Type	    Can store primitives/objects Can only store objects (not primitives)
Performance	Faster (less overhead)	     Slightly slower (more flexible)
Methods	    No built-in methods 	     Has methods like add(), remove(), get()
Import    	No	                         Yes (import java.util.ArrayList;)
ExampleUse	arr[0]	                     list.get(0)
         */
        ArrayList<String> Ash = new ArrayList<>();
        Ash.add("Pikachu");
        Ash.add("Charizard");
        Ash.add("Tepig");
        ArrayList<String> Misty = new ArrayList<>();
        Misty.add("Psyduck");
        Misty.add("Starmie");
        Misty.add("Togepi");
        ArrayList<String> Brock = new ArrayList<>();
        Brock.add("Onix");
        Brock.add("Vulpix");
        ArrayList<ArrayList<String>> pokemon = new ArrayList<>();
        pokemon.add(Ash);
        pokemon.add(Misty);
        pokemon.add(Brock);
        System.out.println(pokemon);

        
    }
}

