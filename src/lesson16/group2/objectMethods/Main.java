package src.lesson16.group2.objectMethods;

import src.lesson16.group2.casting.Vehicle;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "shirali";
        human.age = 12;
        human.hairColour = "qara";

        Human human1 = new Human();
        human1.name = "shirali";
        human1.age = 12;
        human1.hairColour = "qara";

//        String s = human.toString();
//        System.out.println(s);

//        System.out.println(human.equals(human1));
//        System.out.println(human.equals(null));

//        Vehicle vehicle = new Vehicle();
//        System.out.println(human.equals(vehicle));

//        System.out.println(human.getClass().getName());

        System.out.println(human.hashCode());
        System.out.println(human1.hashCode());

        if (human.hashCode() == human1.hashCode()){
            if (human.equals(human1)){
                System.out.println("beraberdir");
            } else {
                System.out.println("ferqlidir");
            }
        } else {
            System.out.println("ferqlidir");
        }
    }

}
