package com.streams.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1demo {
    public static void main(String[] args) {
        List<Integer> i=new ArrayList<>(Arrays.asList(-2,-5,-6,0,5,6));
        List<Integer> li=i.stream()
                .filter(n->n<0&&n%2==0)
                .collect(Collectors.toList());
        System.out.println(li);
    }
}
