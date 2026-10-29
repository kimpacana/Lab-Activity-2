
public abstract class Vehicle {

    protected final String brand;
    protected final String model;
    protected final int year;
    private double totalKm;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.totalKm = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getTotalKm() {
        return totalKm;
    }

    protected String fullName() {
        return brand + " " + model;
    }

    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("[" + year + "] " + fullName());
    }

    public void drive(int km) {
        totalKm += km;
        System.out.println(fullName() + " travelled " + km + " km.");
    }

    public void drive(int km, String destination) {
        totalKm += km;
        System.out.println(fullName() + " headed to " + destination
                + " (" + km + " km).");
    }

    public void drive(int km, String destination, boolean highway) {
        totalKm += km;

        String road;

        if (highway) {
            road = "via the highway";
        } else {
            road = "via local roads";
        }

        System.out.println(fullName() + " went to " + destination
                + " " + road + " (" + km + " km).");
    }

    public abstract void moveForward();

    public abstract void moveBackwards();

    public abstract void moveLeft();

    public abstract void moveRight();
}
