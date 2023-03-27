package com.streams.hashmap;

import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("anusha",9);
        map.put("anu",8);
        map.put("tapasi",11);
        map.entrySet().stream().filter(y->y.getValue()>10).forEachOrdered(n->System.out.println(n.getKey()+" "+n.getValue()));
    }
}
