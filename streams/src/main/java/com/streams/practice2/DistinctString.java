package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctString {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "banana", "date", "cherry"));
        List<String> s=str.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(s);
    }
}
