package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingSubString {
    public static void main(String[] args) {
        ArrayList<String> i=new ArrayList<>(Arrays.asList("anusha","anu","surya"));
        String s="anusha";
        i.stream().filter(n->!n.contains(s)).forEach(System.out::println);

    }
}
