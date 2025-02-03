// Base class: Vehicle
class Vehicle {
    void startEngine() {
        System.out.println("Starting the engine of the vehicle.");
    }

    void vehicleType() {
        System.out.println("This is a generic vehicle.");
    }
}

// Derived class: Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the car engine.");
    }

    @Override
    void vehicleType() {
        System.out.println("This is a Car.");
    }
}

// Derived class: Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    void vehicleType() {
        System.out.println("This is a Motorcycle.");
    }
}

// Main class to test the functionality
public class VehicleTestDrive {
    public static void main(String[] args) {
        // Create different vehicle objects
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Call methods on vehicle objects
        System.out.println("Test Drive 1:");
        car.startEngine();
        car.vehicleType();

        System.out.println("\nTest Drive 2:");
        motorcycle.startEngine();
        motorcycle.vehicleType();
    }
}
