package com.streams.hashmap;

import java.util.HashMap;

public class HashMap7 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("anusha",1);
        map.put("anu",3);
        map.put("tapasi",4);
       map.entrySet().stream().filter(entry -> !entry.getKey().startsWith("a")).forEach(System.out::println);
    }
}
