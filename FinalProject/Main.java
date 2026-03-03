package FinalProject;
import java.util.Scanner;

public class Main {

    public static void addNewVehicle(VehicleManager manager, Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
        System.out.print("Enter color: ");
        String color = scanner.next();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter mileage: ");
        int mileage = scanner.nextInt();

        Automobile newVehicle = new Automobile(make, model, color, year, mileage);
        manager.addVehicle(newVehicle);
    }

    public static void removeVehicle(VehicleManager manager, Scanner scanner) {
        System.out.print("Enter the index of the vehicle to remove: ");
        int index = scanner.nextInt();
        manager.removeVehicle(index);
    }

    public static void updateVehicle(VehicleManager manager, Scanner scanner) {
        System.out.print("Enter the index of the vehicle to update: ");
        int index = scanner.nextInt();
        System.out.print("Enter new make: ");
        String make = scanner.next();
        System.out.print("Enter new model: ");
        String model = scanner.next();
        System.out.print("Enter new color: ");
        String color = scanner.next();
        System.out.print("Enter new year: ");
        int year = scanner.nextInt();
        System.out.print("Enter new mileage: ");
        int mileage = scanner.nextInt();

        manager.updateVehicleAttributes(index, make, model, color, year, mileage);
    }

    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        Scanner scanner = new Scanner(System.in);

        // Create some automobile instances and add them to the manager
        Automobile Betsy = new Automobile("Toyota", "Camry", "Red", 2010, 120000);
        Automobile OldBlue = new Automobile("Ford", "F-150", "Blue", 2005, 150000);
        Automobile Frank = new Automobile("Honda", "Civic", "Black", 2015, 90000);
        Automobile Bertha = new Automobile("Chevrolet", "Impala", "White", 2000, 200000);

        // Add vehicles to the manager
        manager.addVehicle(Betsy);
        manager.addVehicle(OldBlue);
        manager.addVehicle(Frank);
        manager.addVehicle(Bertha);

        System.out.println("\nIWelcome to the Vehicle Manager!");
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Display all vehicles");
            System.out.println("2. Add a new vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Update a vehicle's attributes");
            System.out.println("5. Exit\n");

            // Get user input for choice and handle the options accordingly
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // (This part can be implemented using Scanner for user input, but is omitted here for brevity)
            switch(choice) {
                case 1:
                    manager.displayVehicles();
                    break;
                case 2:
                    addNewVehicle(manager, scanner);
                    break;
                case 3:
                    removeVehicle(manager, scanner);
                    break;
                case 4:
                    updateVehicle(manager, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the Vehicle Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}