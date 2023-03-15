package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 6));
        List<Integer> li = i.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(li);


        ArrayList<String> str = new ArrayList<>(Arrays.asList("anusha", "an", "surya"));
        List<String> s = str.stream()
                .filter(n -> n.contains("u"))
                .collect(Collectors.toList());
        System.out.println(s);
        i.stream()
                .filter(n->n%2==0)
                .forEach(n->System.out.println(n));
    }
}
