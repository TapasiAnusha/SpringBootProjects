package com.streams.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("anusha",1);
        map.put("anu",3);
        map.put("tapasi",4);
       Map.Entry<String,Integer> m= map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
       System.out.println(m.getKey()+" "+m.getValue());
    }
}
