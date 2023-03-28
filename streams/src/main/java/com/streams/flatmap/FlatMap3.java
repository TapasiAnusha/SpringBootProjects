package com.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap3 {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>(Arrays.asList("2","4","5","6"));
       List<Integer> j= s.stream().map(Integer::parseInt).flatMap(Stream::of).collect(Collectors.toList());
        System.out.println(j);
    }
}
