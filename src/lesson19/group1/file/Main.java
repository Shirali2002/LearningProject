package src.lesson19.group1.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ashirali\\Desktop\\file_dersi\\vs_file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int bayt = 0;

//        String s = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        while ((bayt = bis.read()) != -1){
//            s = s + (char) bayt;
            stringBuilder.append((char) bayt);
        }

        String s = stringBuilder.toString();
        System.out.println(s);
    }

    public static void main1(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\ashirali\\Desktop\\file_dersi\\vs_file.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String s = "Hello World\n";
        byte[] arr = s.getBytes();
        String s1 = "Hello World1\n";
        byte[] arr1 = s1.getBytes();
        String s2 = "Hello World2";
        byte[] arr2 = s2.getBytes();

        bos.write(arr);
        bos.write(arr1);
        bos.write(arr2);
        bos.flush();

        bos.close();
        fos.close();

        System.out.println("success");
    }

}
