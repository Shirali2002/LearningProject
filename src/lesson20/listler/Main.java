package src.lesson20.listler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //int -> Integer
        //long -> Long
        //boolean -> Boolean
        //double -> Double
        //float -> Float
        //byte -> Byte
        //short -> Short
        //char -> Character

//        int[]
        List<Integer> arrL = new ArrayList<>(); // <>  ---> generic

        arrL.add(23);//0
        arrL.add(18);//1
        arrL.add(45);//2 --> 3
//        System.out.println(arrL.size());

        arrL.add(2, 4);// --> 2
        arrL.set(2, 5);
//        arrL.remove(5);

//        Integer integer = 5;
//        arrL.remove(integer);
//        System.out.println(arrL.contains(6));;
//        System.out.println(arrL.size());

        System.out.println(arrL);

//        for (Integer a: arrL) {
//            System.out.println(a);
//        }

//        for (int i = 0; i < arrL.size(); i++) {
//            System.out.println(arrL.get(i));
//        }

    }

}
