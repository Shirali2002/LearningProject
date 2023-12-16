package src.lesson13.group1.overriding;

public class Dog extends Animal {

    private String foot;  //shift + f6

    public Dog(String colour, String shape, String foot) {
//        super.eating();
        super(colour, shape);
        this.foot = foot;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public void eatingiCagirmaMetodu() {
        super.eating();
    }

    public void eating() {
        System.out.println("dog eating...");
    }

//    public void run() {
//        System.out.println("dog running..");
//    }

}
