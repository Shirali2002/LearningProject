package src.lesson20.setler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(-1);

        System.out.println(treeSet);
    }

//    public static void main(String[] args) {
//        Set<Integer> hSet = new HashSet<>();
//        hSet.add(5);
//        hSet.add(6);
//        hSet.add(17);
//        hSet.add(5);
//        hSet.remove(5);
//
//        System.out.println(hSet);
//
//        for (Integer a :hSet) {
//            System.out.println(a);
//        }
//    }

}
