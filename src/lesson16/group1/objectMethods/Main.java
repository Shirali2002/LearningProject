package src.lesson16.group1.objectMethods;

public class Main {

    public static void main(String[] args) throws Throwable {
        Human human = new Human();
        human.name = "shirali";
        human.age = 12;
        human.hairColour = "qara";
        //alt+Enter

        System.out.println(human.age);
        System.out.println(human.getClass());
    }
//    public static void main(String[] args) {
//        Human human = new Human();
//        human.name = "shirali";
//        human.age = 12;
//        human.hairColour = "qara";
//
//        Human human1 = new Human();
//        human1.name = "shirami";
//        human1.age = 12;
//        human1.hairColour = "qara";
//
////        String s = human.toString();
//        int hashCode = human.hashCode();
//        System.out.println(hashCode);
//
//        int hashCode1 = human1.hashCode();
//        System.out.println(hashCode1);
//    }
}
