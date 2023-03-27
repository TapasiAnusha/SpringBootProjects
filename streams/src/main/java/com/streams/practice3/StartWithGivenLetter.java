package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class StartWithGivenLetter {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("anusha","surya","mohan","anu"));
        str.stream().filter(s->s.charAt(0)=='a').forEach(System.out::println);

    }
}
