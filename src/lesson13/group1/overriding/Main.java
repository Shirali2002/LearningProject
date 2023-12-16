package src.lesson13.group1.overriding;

public class Main {

    public static void main(String[] args) {
        new Animal("yasil", "kvadrat");
    }

//    public static void main(String[] args) {
//        Animal animal = new Animal("qirmizi");
//        animal.eating();

//        Dog dog = new Dog("qirmizi", "4");
//        dog.eating();
//
//        Animal animal = new Dog("qirmizi", "4");
//        animal.eating();

//        Animal animal = new Bird("qirmizi", "2");
//        animal.eating();

//        Dog dog = new Dog("sari", "4");
//        dog.eatingiCagirmaMetodu();
//
//        Dog dog1 = new Dog("sari", "4"); // ctrl + d
//        Dog dog2 = null;
//        boolean b = dog1 instanceof Animal;
//        boolean b2 = dog2 instanceof Animal;
//        System.out.println(b2);
//
//        Dog dog = new Dog("sari", "4");
//        Bird bird = new Bird("sari", "2");
//
//        System.out.println(isDog(dog));;
//        System.out.println(isDog(bird));;
//
//
//    }

    public static boolean isDog(Animal animal) {
        if (animal instanceof Dog){
            return true;
        } else if (animal instanceof Bird) {
            return false;
        } else {
            System.out.println("else e girdi");
            return false;
        }
    }

}
