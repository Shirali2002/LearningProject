package src.lesson18.group1.error;

public class StackOverflowErrorAlmaq {

    public static void main(String[] args) {
        StackOverflowErrorAlmaq s = new StackOverflowErrorAlmaq();
        try {
            s.plus1(2);
        } catch (Error ex) {
            System.out.println("stackOverflow bas verdi");
        }
    }

    public int plus1(int a) {
        return plus1(a + 1);
    }

}
