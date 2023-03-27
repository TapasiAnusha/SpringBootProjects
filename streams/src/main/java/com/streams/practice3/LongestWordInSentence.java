package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String s="hi i am anusha";
        ArrayList<String> str=new ArrayList<>(Arrays.asList(s.split(" ")));
      String t=str.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()).get(str.size()-1);
        System.out.println(t);
    }
}
