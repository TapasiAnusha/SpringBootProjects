package com.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap6 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(2,3,4));
        ArrayList<Integer> j=new ArrayList<>(Arrays.asList(5,6,7));
        Stream.of(i,j).flatMap(List::stream).flatMap(n->Stream.of(n*2)).forEach(System.out::println);
    }
}
