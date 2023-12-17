package src.lesson15.group2.nestedClass;

public class Vehicle {

    public String brand;

    static class Motorcycle {
        public void tekerSayiMotorcycle(){
            System.out.println("2 teker");
        }
    }

    class Car {
        public void tekerSayiCar(){
            System.out.println("4 teker");
        }
    }

}
