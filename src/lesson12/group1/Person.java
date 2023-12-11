package src.lesson12.group1;

public class Person {

    // static <-> instance

    public String name; //ctrl + l
    public String surname;
    public int age; // instance variable
    public static String hasEar; // static variables

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static {
        int a = Integer.MIN_VALUE;
        if (1 == 1) {
            a = 9;
            hasEar = "yes";
        } else {
            a = 12;
            hasEar = "No";
        }
    }

    public static void salamlama() {
//        int a = 4; //local
//        Person person = new Person("shirali", "alijsdfs", 21);
//        System.out.println(person.age);

//        System.out.println(age);
        System.out.println(hasEar);
        System.out.println("herkese salam");
        System.out.println(Constant.RANDOM_TEXT);


//        sagollasma()
    }

    public static void sagollasma() {
        System.out.println(Constant.RANDOM_TEXT);
//        salamlama();
        System.out.println("sagol");
    }
}
