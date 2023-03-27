package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Long.MIN_VALUE;
import static java.lang.Long.max;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(2,5,7,3,4,8));
        int max=i.stream().reduce(0,Integer::max);
        int min=i.stream().min((x,y)->x>y?1:-1).get();
        System.out.println(max+" "+min);
    }
}
