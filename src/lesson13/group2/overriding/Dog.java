package src.lesson13.group2.overriding;

public class Dog extends Animal {

    private String foot;


    public Dog(String colour, String foot) {
        super(colour);
        this.foot = foot;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public void eating() {
        System.out.println("dog eating...");
    }

    public void eatingCagiranMetod() {
        super.eating();
    }

}
