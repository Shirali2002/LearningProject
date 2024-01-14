package src.lesson20.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Iki");
        hashMap.put(1, "Bir");
        hashMap.put(3, "Uc");

//        System.out.println(hashMap.get(1));
//        Set<Integer> keys = hashMap.keySet();
//        System.out.println(keys);
//        Collection<String> values = hashMap.values();
//        for (String s : values) {
//            System.out.println(s);
//        }

//        hashMap.put(3, "Uch");
//        System.out.println(hashMap);

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(entry);
        }


    }

}
