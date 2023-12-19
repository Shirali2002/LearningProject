package src.lesson15.group1.interfacee;

public interface Animal extends Canli, QurudaYasayan {

    String colour = "sari"; // public static final String colour;

    void eating(); // public abstract void eating();

    default void foo() { // public void foo(){}
        fooPriv();
    }

    static void fooStatic() {

    }

    private void fooPriv() {

    }

}
