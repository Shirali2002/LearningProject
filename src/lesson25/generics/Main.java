package src.lesson25.generics;

import src.lesson12.group1.Human;

import java.util.ArrayList;
import java.util.List;

public class Main { // alt + insert

    public static void main(String[] args) {
        MyGeneric<List<String>> myGeneric = new MyGeneric<>();

//        String dataType = myGeneric.getDataType();
    }

//    public static MyGeneric<Integer> foo() {
//        return new MyGeneric<>();
//    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        testGeneric("sdfs");
//        testGeneric(1);
//        testGeneric(true);
//        testGeneric(new Human("shirali"));
//    }
//
//    public static <T> void testGeneric(T param) {
//        System.out.println(param);
//    }

}
