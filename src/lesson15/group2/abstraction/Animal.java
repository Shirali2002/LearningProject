package src.lesson15.group2.abstraction;

public abstract class Animal {

    private String colour; // ortaq xususiyyetler

    public Animal(String colour) {
        this.colour = colour;
    }

    public Animal() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

//    public void eating() {
//        System.out.println("animal eating...");
//    }

    public abstract void eating();

//    public final void foo() {
//        System.out.println("foo");
//    }

}
