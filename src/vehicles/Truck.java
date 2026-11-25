package vehicles;

import contracts.Serviceable;

public class Truck extends Vehicle implements Serviceable {
    private double cargoCapacityTons;
    private int wheels = 6;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " " + getModel() + " (Truck) moves on " + wheels + " wheels, hauling heavy cargo.");
    }

    @Override
    public void moveForward() {
        System.out.println(getBrand() + " " + getModel() + " (Truck) moves forward with its heavy load.");
    }

    @Override
    public void moveReverse() {
        System.out.println(getBrand() + " " + getModel() + " (Truck) moves in reverse with a warning beep.");
    }

    @Override
    public void turnLeft() {
        System.out.println(getBrand() + " " + getModel() + " (Truck) makes a wide turn to the left.");
    }

    @Override
    public void turnRight() {
        System.out.println(getBrand() + " " + getModel() + " (Truck) makes a wide turn to the right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Wheels: " + wheels + ", Cargo Capacity: " + cargoCapacityTons + " tons");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}
