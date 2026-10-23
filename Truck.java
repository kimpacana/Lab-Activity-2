public class Truck extends Vehicle {
    private static final int DEFAULT_WHEELS = 6;

    private final double payloadTons;
    private final int wheelCount;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year);
        this.payloadTons = cargoCapacityTons;
        this.wheelCount = DEFAULT_WHEELS;
    }

    public int getWheels() {
        return wheelCount;
    }

    public double getCargoCapacityTons() {
        return payloadTons;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName() + " -> Truck: the diesel engine rumbles and shakes the ground.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Category: Truck | Wheels: " + wheelCount + " | Payload: " + payloadTons + " tons");
    }
}