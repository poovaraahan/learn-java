public class array_of_objects {
    public static void main(String[] args){
        Food[] refrigerator = new Food[3]; // Creating an array of Food objects. Memory is allocated for 3 Food objects.
        // Each element of the array is initially null until we assign Food objects to them.
        Food food1 = new Food("pizza");
        Food food2 = new Food("apple");
        Food food3 = new Food("chocolate");
        refrigerator[0] = food1; // Assigning Food objects to the array
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        /*
         * OR
         * {
         * Food food1 = new Food("pizza");
         * Food food2 = new Food("apple");
         * Food food3 = new Food("chocolate");
         * Food[] refrigerator = {food1, food2, food3}; // Creating and initializing the array in one line
         * }
         * Memory is automatically allocated for 3 Food objects.
         */
        System.out.println(refrigerator[0].name); // Accessing the name attribute of the first Food object
        //If .name is not used, it will print the address of the object in memory
        System.out.println(refrigerator[1].name); // Accessing the name attribute of the second Food object
        System.out.println(refrigerator[2].name); // Accessing the name attribute of the third Food object
   
    }
    
}
