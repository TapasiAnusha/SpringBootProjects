package com.streams.hashmap;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(4,"anusha");
        map.put(8,"anu");
        map.put(6,"tapasi");
        map.entrySet().stream().filter(x->x.getKey()<5).forEach(System.out::println);
    }
}
