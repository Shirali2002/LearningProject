package src.lesson12.group2;

public class Car {
    private String model; //alt+insert

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    //---------------------------------
//    private int model;
//
//    public String getModel() {
//        if (model == 1) {
//            return "BMW";
//        } else if (model == 2) {
//            return "Mercedes";
//        } else {
//            return "Hundai";
//        }
//    }
//
//    public void setModel(String model) {
//        if ("BMW".equals(model)) {
//            this.model = 1;
//        } else if ("Mercedes".equals(model)){
//            this.model = 2;
//        } else {
//            this.model = 3;
//        }
//    }


}
