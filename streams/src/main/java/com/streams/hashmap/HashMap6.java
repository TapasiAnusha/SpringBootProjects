package com.streams.hashmap;

import java.util.HashMap;

public class HashMap6 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("anusha",1);
        map.put("anu",3);
        map.put("tapasi",4);
      int s= map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(s);
    }
}
