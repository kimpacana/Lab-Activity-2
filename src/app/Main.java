package app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2015, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500", 2020, 500);
        Truck truck = new Truck("Isuzu", "Giga", 2018, 12.5);
        Printer printer = new Printer();

       
        Serviceable[] serviceables = {car, motorcycle, truck, printer};

        System.out.println("=== Service (Serviceable[]) ===");
        for (Serviceable item : serviceables) {
            performService(item);
        }

        System.out.println();

       
        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println("=== Vehicles (Vehicle[]) ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.move();
            v.moveForward();
            v.turnLeft();
            v.turnRight();
            v.moveReverse();
            System.out.println();
        }
    }
}
