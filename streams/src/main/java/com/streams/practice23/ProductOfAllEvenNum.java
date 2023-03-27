package com.streams.practice23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProductOfAllEvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(2,3,4,6,5,7));
      int p=i.stream().filter(n->n%2==0).reduce(1,(x,y)->x*y);
        System.out.println(p);


    }
}
