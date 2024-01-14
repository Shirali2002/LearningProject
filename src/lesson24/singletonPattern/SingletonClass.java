package src.lesson24.singletonPattern;

public class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getINSTANCE() {
        return INSTANCE;
    }

    public void helloWorld() {
        System.out.println("Hello World!");
    }

}
