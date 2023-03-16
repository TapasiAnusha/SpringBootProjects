package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfList {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>(Arrays.asList(2,3,4,5,6));
        int p=li.stream().reduce(1,(x,y)->x*y);
        System.out.println(p);
    }
}
