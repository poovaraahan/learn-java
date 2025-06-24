public class OOP {
    public static void main(String[] args) {
        //Constructors allow different attributes to be assigned to each object that we instantiate
        Pokemon myPokemon = new Pokemon("Pikachu","Mouse/Electric",1,6.0,"thunderbolt", "Pika....CHUUUU!"); // created an instance for the class Pokemon
        // In this scenario, for constructors, values of the variable attributes declared in Main class and not imported from elsewhere 
        System.out.println(myPokemon.name);
        System.out.println(myPokemon.type);
        System.out.println(myPokemon.generation);
        System.out.println(myPokemon.weight);
        myPokemon.combat();
        // CREATING ANOTHER INSTANCE FOR THE SAME CLASS
        Pokemon myPokemon2 = new Pokemon("Bulbasaur", "Grass/Poison",1,6.9, "vine whip", "Saurrr!"); // created an instance for the class Pokemon 
        System.out.println(myPokemon2.name);
        System.out.println(myPokemon2.type);
        System.out.println(myPokemon2.generation);
        System.out.println(myPokemon2.weight);
        myPokemon2.combat();
        // CREATING ANOTHER INSTANCE FOR THE SAME CLASS
        Pokemon myPokemon3 = new Pokemon("Chikorita", "Grass",2,6.4,"razor leaf", "Chiko!"); // created an instance for the class Pokemon 
        System.out.println(myPokemon3.name);
        System.out.println(myPokemon3.type);
        System.out.println(myPokemon3.generation);
        System.out.println(myPokemon3.weight);
        myPokemon3.combat();
        //
        
    }
}
