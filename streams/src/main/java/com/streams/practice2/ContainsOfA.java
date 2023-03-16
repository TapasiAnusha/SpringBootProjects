package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsOfA {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>(Arrays.asList("anusha","razee","surya","moghs","mnoj"));
        List<String> s=str.stream()
                .filter(s1 -> !s1.contains("a"))
                .collect(Collectors.toList());
        System.out.println(s);
    }
}
