package src.lesson15.group2.interfaceee;

public interface Animal extends Canli, QurudaYasayan {

    String colour = "qirmizi"; // public static final

    void eating(); // public abstract

    default void sleeping1() {
        System.out.println("sleeping");
        sleeping3();
    }

    static void sleeping2() {
        System.out.println("sleeping");
    }

    private void sleeping3() {
        System.out.println("sleeping");
    }

    private static void sleeping4() {
        System.out.println("sleeping");
    }

}
