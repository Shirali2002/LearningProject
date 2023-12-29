package src.lesson19.group2.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\ashirali\\Desktop\\file_dersi\\vs_file.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("dsfs");
        bufferedWriter.flush();
    }

//    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("C:\\Users\\ashirali\\Desktop\\file_dersi\\vs_file.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//
//        int bayt = 0;
////        String text = "";
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();
//
//        while ((bayt=bis.read()) != -1) {
////            text += (char)bayt;
//            stringBuilder.append((char) bayt);
////            stringBuffer.append((char) bayt);
//        }
//
//        String text = stringBuilder.toString();
////        String text1 = stringBuffer.toString();
//        System.out.println(text);
//    }

//    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\ashirali\\Desktop\\file_dersi\\vs_file.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        String s = "Hello World\n";
//        byte[] bytes = s.getBytes();
//        String s1 = "Hello World\n";
//        byte[] bytes1 = s1.getBytes();
//        String s2 = "Hello World\n";
//        byte[] bytes2 = s2.getBytes();
//
//        bos.write(bytes);
//        bos.write(bytes1);
//        bos.write(bytes2);
//        bos.flush();
//    }

}
