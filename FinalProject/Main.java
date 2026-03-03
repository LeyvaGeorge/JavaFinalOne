package FinalProject;

public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        Automobile Betsy = new Automobile("Toyota", "Camry", "Red", 2010, 120000);
        Automobile OldBlue = new Automobile("Ford", "F-150", "Blue", 2005, 150000);
        Automobile Frank = new Automobile("Honda", "Civic", "Black", 2015, 90000);

        manager.addVehicle(Betsy);
        manager.addVehicle(OldBlue);
        manager.addVehicle(Frank);

        manager.displayVehicles();
        // Create an instance of the game and start it
        // Automobile coupe = new Automobile();
    }
}