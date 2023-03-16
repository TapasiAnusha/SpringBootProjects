package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        int sum=i.stream().reduce(0,(a,b)->a+b);//reduce(0,Integer::sum);
        System.out.println(sum);
        long c=i.stream().filter(n->n%2==0).count();
        System.out.println(c);
        int max=i.stream().reduce(Integer.MIN_VALUE,Integer::max);
        int min=i.stream().reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println(max+" "+min);
        int maximum=i.stream().max((x,y)->x>y?1:-1).get();
        System.out.println(maximum);
        int minimum=i.stream().min((x,y)->x>y?1:-1).get();
        System.out.println(minimum);
        Stream.iterate(0,n->n+2)
                .limit(10)
                .forEach(System.out::println);
        Stream.iterate(1,n->n+1)
                .filter(n->n%2!=0)
                .limit(5)
                .forEach(System.out::println);
        str.stream().map(String::toUpperCase)
                .forEach(System.out::println);

    }

}
