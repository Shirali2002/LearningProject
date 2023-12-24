package src.lesson17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("adinizi daxil edin:");
        String name = sc.nextLine();
        System.out.printf("Xosgeldin, %s\n", name);

        int random = (int) (Math.random() * 100);

        System.out.println("dusunduyum ededi tapin");
        while (true) {
            int eded = sc.nextInt(); // shift + f6

            if (eded > random) {
                System.out.println("dusunduyum eded bundan kicikdir.");
            } else if (eded < random) {
                System.out.println("dusunduyum eded bundan boyukdur");
            } else {
                System.out.println("tebrikler. dogru cavabi tapdiniz");
                break;
            }
        }
    }

}
