package src.lesson15.group1.enummmm;

public class Main {

    public static void main(String[] args) {
//        System.out.println(CarModels.MERCEDES_BENZ);
//        CarModels opel = CarModels.OPEL;
//        System.out.println(opel.name());

//        CarModels[] values = CarModels.values();
//
//        for (int i = 0; i<values.length; i++) {
//            System.out.println(values[i]);
//        }

//        CarModels bmw = CarModels.valueOf("BMW");
//        System.out.println(bmw);

//        System.out.println(CarModels.AUDI.ordinal());

//        CarModels[] values = CarModels.values();
//        System.out.println(values[3]);

        System.out.println(CarModels.MERCEDES_BENZ.getModelSayi());

        String[] modeller = CarModels.MERCEDES_BENZ.getModeller();
        System.out.println(modeller[0]);
//        for (int i = 0; i < modeller.length; i++) {
//            System.out.println(modeller[i]);
//        }

        String[] modellerBMW = CarModels.BMW.getModeller();
        System.out.println(modellerBMW[1]);
    }

}
