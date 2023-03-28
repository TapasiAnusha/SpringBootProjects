package com.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(2,3,4,5));
        i.stream().map(n->n*10).forEach(System.out::println);
        i.stream().flatMap(n-> Stream.of(n+10,n+20)).forEach(System.out::println);
    }
}
