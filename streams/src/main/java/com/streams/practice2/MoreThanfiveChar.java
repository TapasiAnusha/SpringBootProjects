package com.streams.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MoreThanfiveChar {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>(Arrays.asList("anusha","anu","sutya","mohanraj"));
     Optional<String> j= s.stream().filter(n->n.length()>5)
                .findFirst();
System.out.println(j);
    }
}
