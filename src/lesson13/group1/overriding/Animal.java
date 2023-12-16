package src.lesson13.group1.overriding;

public class Animal {

    protected String colour;
    protected String shape;

    public Animal(String colour, String shape) {
        this.colour = colour;
        this.shape = shape;
    }

    public Animal() {
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
