package com.streams.practice23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOccurance {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5, 6, -7, 8, 9, 10, -11, 12);
        int maxLength = numbers.stream()
                .filter(n -> n > 0) // Only consider positive integers
                .reduce(new int[]{0, 0}, (acc, n) -> {
                    System.out.println(Arrays.toString(acc)+" "+n);
                    int length = (n == acc[1] + 1) ? acc[0] + 1 : 1;
                    System.out.println("length"+"="+length);
                    return new int[]{Math.max(acc[0], length), n};
                }, (a, b) -> {
                    throw new UnsupportedOperationException("Parallel processing not supported.");
                })[0];
        System.out.println("Maximum length of consecutive positive integers: " + maxLength);
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "world", "java", "stream", "pipeline");
        Map<String, Long> wordFrequencies = words.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println("Word frequencies: " + wordFrequencies);
    }
}

