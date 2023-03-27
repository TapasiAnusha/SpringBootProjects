package com.streams.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(8,"anusha");
        map.put(4,"anu");
        map.put(6,"tapasi");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(entry->System.out.println(entry.getKey()+" "+entry.getValue()));//forEach(System.out::println);
    }
}
