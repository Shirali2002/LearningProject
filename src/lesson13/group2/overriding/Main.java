package src.lesson13.group2.overriding;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("sari", "4");
        Bird bird = new Bird("sari", "2");
        Animal animal = new Animal("qirmizi");

        foo(animal);

//        boolean b = dog instanceof Animal;
//        System.out.println(b);
    }

    public static void foo(Animal animal){
        if (animal instanceof Dog) {
            System.out.println("dog");
        } else if (animal instanceof Bird) {
            System.out.println("bird");
        } else {
            System.out.println("else");
        }
    }

//    public static void main(String[] args) {
//        Animal.eating();
//        Dog.eating();
//        Bird.eating();
//
//        Dog dog = new Dog("sari", "4");
//        Bird bird = new Bird("narinci", "2");
//        eatingiCagiranMetod(bird);

//        Animal animal = new Dog("qirmizi", "4");
//        animal.eating();

//        Animal animal = new Animal("qirmizi");
//        animal.eating();
//    }

//    public static void eatingiCagiranMetod(Animal animal) {
//        animal.eating();
//    }

}
