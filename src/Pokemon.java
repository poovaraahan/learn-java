public class Pokemon {
    // Attributes declared for the class Pokemon
    String name;
    String type;
    int generation;
    double weight;
    String attack;
    String battlecry;
    //OVERLOADED CONSTRUCTOR: Different constructors can be created with different number of parameters
    Pokemon(String name, String type, int generation, double weight, String attack, String battlecry){ //Parameters
        this.name = name;
        this.type = type;
        this.generation = generation;
        this.weight = weight;
        this.attack = attack;
        this.battlecry = battlecry;
    }
    Pokemon(String name, String type, int generation, double weight){//Parameters
        this.name = name;
        this.type = type;
        this.generation = generation;
        this.weight = weight;
    }
    Pokemon(String name, String type){ //Parameters
        this.name = name;
        this.type = type;
    }
    void combat(){
        System.out.println(name+", use "+attack+"!");
        System.out.println(battlecry);

    }
    //Overloaded methods can be created with different number of parameters
    //Thus, an instance of the class lacking attributes can still be created 
}