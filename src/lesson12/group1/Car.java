package src.lesson12.group1;

public class Car {

    private String motor = "4.4";
    private String teker = "4 denedi";
    private int model = 2;

//    public void setModel(String model) {
//        switch (model) {
//            case "Mercedes":
//                this.model = 1;
//                break;
//            case "BMW":
//                this.model = 2;
//                break;
//            case "Hundai":
//                this.model = 3;
//                break;
//            default:
//                this.model = -1;
//        }
//    }

    public String getModel() {
        switch (this.model) {
            case 1:
                return "Mercedes";
            case 2:
                return "BWM";
            case 3:
                return "Hundai";
            default:
                return "Unknown";
        }
    }

    public String getMotor() {
        return this.motor;
    }

//    public void setMotor(String motor) {
//        this.motor = motor;
//    }

    public String getTeker() {
        return teker;
    }

//    public void setTeker(String teker) {
//        this.teker = teker;
//    }
}
