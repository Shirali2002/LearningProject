package src.lesson18.group1.thowPart;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int yas = sc.nextInt();

//        checkYas(yas);
        try {
            checkYas(yas);
        } catch (InvalidAgeException e) {
            System.out.println("yas problemi");
        }

        System.out.println("xos gelmisiz");
    }

//    public static void checkYas(int yas) throws IOException {
//        if (yas < 0) {
//            throw new IOException("yasiniz 0dan kicik ola bilmez!");
//        }
//    }
    public static void checkYas(int yas) {
        if (yas < 0) {
            throw new InvalidAgeException("yasiniz 0dan kicik ola bilmez!");
        }
    }
}
