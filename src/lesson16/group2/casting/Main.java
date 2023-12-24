package src.lesson16.group2.casting;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.colour = "sari";

        Car car = new Car();
        car.colour = "qirmizi";
        car.motor = "2.2";

        Vehicle carVehicle = new Car();
        carVehicle.colour = "yasil";

        checkVehicle(vehicle);
        System.out.println("-----------------");
        checkVehicle((Vehicle) car); // upcasting
        System.out.println("-----------------");
        checkVehicle(carVehicle);

        checkCar(car);
        System.out.println("-----------------");
//        checkCar((Car) vehicle); // -> ClassCastException
        System.out.println("-----------------");
        checkCar((Car) carVehicle); // downcasting

    }

    public static void checkVehicle(Vehicle vehicle) {
        System.out.println(vehicle.colour);
    }

    public static void checkCar(Car car) {
        System.out.println(car.colour);
    }

}
