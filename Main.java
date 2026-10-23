import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> garage = new ArrayList<>();
        garage.add(new Car("Toyota", "Corolla", 2015, 4));
        garage.add(new Motorcycle("Honda", "CB500", 2020, 500));
        garage.add(new Truck("Isuzu", "Giga", 2018, 12.5));

        System.out.println("---- Overriding (runtime polymorphism) ----");
        for (Vehicle vehicle : garage) {
            vehicle.displayInfo();
            vehicle.startEngine();
            System.out.println();
        }

        System.out.println("---- Overloading (compile-time polymorphism) ----");
        for (Vehicle vehicle : garage) {
            vehicle.drive(15);
            vehicle.drive(30, "the market");
            vehicle.drive(80, "the airport", true);
            System.out.println("Total distance: " + vehicle.getTotalKm() + " km");
            System.out.println();
        }
    }
}