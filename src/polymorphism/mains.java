package polymorphism;
import java.util.Scanner;
public class mains {
    public static void main(String[] args) {
        vehicle myVehicle;
        System.out.println("Enter the type of vehicle (car = 1, boat = 2,  bike = 3): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1) {
            myVehicle = new car();
            myVehicle.accelerate();
            myVehicle.brake();
        } else if(choice == 2) {
            myVehicle = new boat();
            myVehicle.accelerate();
            myVehicle.brake();
        } else if(choice == 3) {
            myVehicle = new bike();
            myVehicle.accelerate();
            myVehicle.brake();
        } else {
            System.out.println("Invalid choice, defaulting to car.");
            myVehicle = new car();
            myVehicle.accelerate();
            myVehicle.brake();
        }
        scanner.close();
        // You can add more functionality or tests here if needed

    }
}

