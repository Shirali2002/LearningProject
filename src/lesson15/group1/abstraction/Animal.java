package src.lesson15.group1.abstraction;

public abstract class Animal {

    public String colour;

    public Animal() {
    }

    public Animal(String colour) {
        this.colour = colour;
    }

    public abstract void eating();

//    public void eating(){ // non-abstract
//        System.out.println("eating...");
//    }
}
