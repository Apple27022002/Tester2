

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map <String,Integer> hashMap=new HashMap<>();//khai báo Map
        hashMap.put("Nam",9);//khai báo
        hashMap.put("Tam",8);
        hashMap.put("Ninh",7);
        hashMap.put("Nol",12);
        hashMap.put("Non",5);
        Map<String,Integer> treeMap =new TreeMap<>(hashMap);// đặt thứ tự theo treemap
        System.out.println("Hien thi");
        System.out.println(treeMap);//hien thi toan bo treemap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//khai bao
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Anderson"));//linkkedHash là lấy value







    }
}

