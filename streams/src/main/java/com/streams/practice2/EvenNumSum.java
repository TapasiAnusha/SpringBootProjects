package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumSum {
    public static void main(String[] args) {
        List<Integer> i=new ArrayList<>(Arrays.asList(2,4,6,5,3,7));
        int sum=i.stream().filter(n->n%2==0).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
