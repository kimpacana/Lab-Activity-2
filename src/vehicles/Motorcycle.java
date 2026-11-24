package vehicles;

import contracts.Serviceable;

public class Motorcycle extends Vehicle implements Serviceable {
    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) moves on two wheels, leaning into the curves.");
    }

    @Override
    public void moveForward() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) moves forward.");
    }

    @Override
    public void moveReverse() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) is walked backward by the rider.");
    }

    @Override
    public void turnLeft() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) leans and turns left.");
    }

    @Override
    public void turnRight() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) leans and turns right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Engine: " + engineCC + " cc");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}
