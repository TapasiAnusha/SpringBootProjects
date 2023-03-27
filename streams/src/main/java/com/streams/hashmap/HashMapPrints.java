package com.streams.hashmap;

import java.util.HashMap;

public class HashMapPrints {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"anusha");
        map.put(2,"anu");
        map.put(3,"tapasi");
        map.entrySet().stream().forEach(System.out::println);
    }
}
