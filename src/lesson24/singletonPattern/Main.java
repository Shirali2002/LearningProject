package src.lesson24.singletonPattern;

public class Main {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getINSTANCE();

        singletonClass.helloWorld();

    }

}
