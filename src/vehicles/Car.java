package vehicles;

import contracts.Serviceable;

public class Car extends Vehicle implements Serviceable {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " " + getModel() + " (Car) moves on four wheels along the road.");
    }

    @Override
    public void moveForward() {
        System.out.println(getBrand() + " " + getModel() + " (Car) moves forward.");
    }

    @Override
    public void moveReverse() {
        System.out.println(getBrand() + " " + getModel() + " (Car) moves in reverse, backing up slowly.");
    }

    @Override
    public void turnLeft() {
        System.out.println(getBrand() + " " + getModel() + " (Car) turns left.");
    }

    @Override
    public void turnRight() {
        System.out.println(getBrand() + " " + getModel() + " (Car) turns right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Doors: " + doors);
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}
