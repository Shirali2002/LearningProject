package src.lesson10.group2;

public class Car {
    public String reng;
    public int motor;
    public int il;

    public Car(String reng, int motor, int il){
        this.reng = reng;
        this.motor = motor;
        this.il = il;
    }

    public Car(int motor, int il){
        this.motor = motor;
        this.il = il;
    }

    public Car(String reng, int motor){
        this.reng = reng;
        this.motor = motor;
    }

    public Car(String reng){
        this.reng = reng;
    }

    public Car(){
    }

    public void drive() {
        System.out.println("drive metodu ishe dushdu");
    }

    public void tormoz() {
        System.out.println("tormoz metodu ishe dushdu");
    }
}
