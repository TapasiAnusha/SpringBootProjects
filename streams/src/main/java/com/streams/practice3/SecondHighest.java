package com.streams.practice3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(2,5,7,3,4,8));
       List<Integer> j= i.stream().sorted().collect(Collectors.toList());
        System.out.println(j.get(j.size()-2));
    }
}
