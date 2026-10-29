
public class Car extends Vehicle {

    private final int numberOfDoors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.numberOfDoors = doors;
    }

    public int getDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName() + " -> Car: press the start button and it purrs to life.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Car | Doors: " + numberOfDoors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car turns right");
    }
}
