package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreThanfiveChar {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>(Arrays.asList("anusha","anu","sutya","mohanraj"));
     String j= String.valueOf(s.stream().filter(n->n.length()>5)
                .findFirst());
System.out.println(j);
    }
}
