
public class Main {

    public static void main(String[] args) {

        Vehicle[] garage = {
            new Car("Toyota", "Corolla", 2015, 4),
            new Motorcycle("Honda", "CB500", 2020, 500),
            new Truck("Isuzu", "Giga", 2018, 12.5)
        };

        for (Vehicle vehicle : garage) {
            vehicle.displayInfo();
            vehicle.startEngine();

            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println();
        }

        for (Vehicle vehicle : garage) {
            vehicle.drive(15);
            vehicle.drive(30, "the market");
            vehicle.drive(80, "the airport", true);

            System.out.println("Total distance: "
                    + vehicle.getTotalKm() + " km");

            System.out.println();
        }
    }
}
