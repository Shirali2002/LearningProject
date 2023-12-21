package src.lesson16.group1.casting;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.colour = "sari";

        Car car = new Car();
        car.colour = "qirmizi";
//        car.motor = "2.2";

        System.out.println("-----------------");
        checkVehicle(vehicle);
        System.out.println("-----------------");
        checkVehicle(car); // upcasting

        System.out.println("-----------------");
        checkCar(car);
        System.out.println("-----------------");
//        checkCar( (Car) vehicle); // downcasting -> ClassCastException

        Vehicle vehicle1 = new Car();
        vehicle1.colour = "yasil";

        checkCar((Car) vehicle1); // downcasting
    }

    public static void checkVehicle(Vehicle vehicle){
        System.out.println(vehicle.colour);
    }

    public static void checkCar(Car car){
        System.out.println(car.colour);
    }

}
