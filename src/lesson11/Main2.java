package src.lesson11;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.printf("%d %d\n", number/10, number%10);
        String  name = "asdfgh";
        name.contains("");

    }
    public int countNumbers(int number){
        int count = 1;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
}