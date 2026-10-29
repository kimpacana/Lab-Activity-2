
public class Motorcycle extends Vehicle {

    private final int displacement;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.displacement = engineCC;
    }

    public int getEngineCC() {
        return displacement;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName() + " -> Motorcycle: hit the starter and the engine growls awake.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Motorcycle | Displacement: " + displacement + " cc");
    }

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle turns right");
    }
}
