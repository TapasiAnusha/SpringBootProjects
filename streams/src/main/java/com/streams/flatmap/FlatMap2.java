package com.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap2 {
    public static void main(String[] args) {
        List<List<Integer>> i=Arrays.asList(Arrays.asList(2,3),Arrays.asList(5,6),Arrays.asList(8,9));
      List<Integer> j= i.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(j);
    }
}
