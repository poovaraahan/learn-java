public class For {
    public static void main(String[] args){
        //for loop iterates over a range of values->executed finite number of times
        for(int i = 10; i >= 0; i--){ // Loop from 10 to 0
            // i = 10 -> initialization  of index
            // i >= 0 -> condition to check if the loop should continue
            // i-- -> decrement the index by 1 after each iteration
            System.out.println("Tick Tick: " + i); // Print the current iteration number
        }
        System.out.println("Kaala Kodumai kathirava!");
    }
}
