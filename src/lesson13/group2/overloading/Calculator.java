package src.lesson13.group2.overloading;

public class Calculator {

    public int sum(final int a, final int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(float a, float b) {
        return a + b;
    }

//    public long sum(int a, long b) {
//        return a + b;
//    }

    public long sum(long a, long b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

}
