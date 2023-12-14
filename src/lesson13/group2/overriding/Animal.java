package src.lesson13.group2.overriding;

public class Animal {

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

    public void eating() { //private -> default -> protected -> public
        System.out.println("animal eating...");
    }

}
