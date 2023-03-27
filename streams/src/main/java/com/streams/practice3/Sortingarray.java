package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sortingarray {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
        s.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
    }

}
