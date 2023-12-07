package src.lesson10.group1;

public class Car {
    // public
    // private
    // default
    // protected

    public String reng;
    public int motor;
    public int il;
    private int kilometraj;
//    private String gizliParol;
//    String beyinVersiyasi;
//    protected String beyin;

    public Car(String reng, int motor, int il, int kilometraj) {
        this.reng = reng;
        this.motor = motor;
        this.il = il;
        this.kilometraj = kilometraj;
    }

    public Car(String reng, int motor, int il) {
        this.reng = reng;
        this.motor = motor;
        this.il = il;
    }

    public Car() {
    }

    private void drive(){
//        gizliParol = "skjdfnskjnfskj";
        System.out.println("drive metodu cagirildi");
    }

    public void tormoz(){
        System.out.println("tormoz metodu cagirildi");
    }

    public int getKilometraj() {
        return kilometraj;
    }

}
