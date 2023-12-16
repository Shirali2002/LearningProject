package src.lesson13.group1.overriding;

public class Bird extends Animal {

    private String wing;

    public Bird(String colour, String wing) {
        super(colour, "");
        this.wing = wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public void eating() {
        System.out.println("bird eating...");
    }

}
