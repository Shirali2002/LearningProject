package src.lesson13.group1.overriding;

public class Animal extends Object{

    private String colour;

    public Animal(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void eating() {
        System.out.println("animal eating...");
    }

    public final void run() {
        System.out.println("animal running...");
    }

}
