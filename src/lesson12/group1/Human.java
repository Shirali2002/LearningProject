package src.lesson12.group1;

import src.lesson10.group2.Calculator;
//import src.lesson10.group2.*;


public class Human { // ctrl + .

    public String name;
    public String surname;//alt+insert
    public int age;
    public Address address; // human has a address

    public static String hasHead = "yes";

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public void salamlama() {
        Calculator calculator2 = new Calculator();
        src.lesson10.group1.Calculator calculator1 = new src.lesson10.group1.Calculator();
        System.out.println("salam Human");
    }

}
