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

    // Runtime polymorphism: every subclass must provide its own version
    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("[" + year + "] " + fullName());
    }

    // Compile-time polymorphism: three overloads of drive()
    public void drive(int km) {
        totalKm += km;
        System.out.println(fullName() + " travelled " + km + " km.");
    }

    public void drive(int km, String destination) {
        totalKm += km;
        System.out.println(fullName() + " headed to " + destination + " (" + km + " km).");
    }

    public void drive(int km, String destination, boolean highway) {
        totalKm += km;
        String road = highway ? "via the highway" : "via local roads";
        System.out.println(fullName() + " went to " + destination + " " + road + " (" + km + " km).");
    }
}