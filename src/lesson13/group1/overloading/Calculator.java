package src.lesson13.group1.overloading;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

//    public long sum(int a, int b) {   -> bu formada olmaz
//        return a + b;
//    }

    public long sum(long a, long b) {
        return a + b;
    }

//    public int sum(int a, int b, int c) {
//        return a + b + c;
//    }

    public long sum(int a, int b, long c) {
        return a + b + c;
    }

    public float sum(float a, float b) {
        return a + b;
    }

}
