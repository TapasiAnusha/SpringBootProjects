package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumBetGivenTwoNum {
    public static void main(String[] args) {
//without streams
        int n1 = 8, n2 = 10;
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        //using streams
        int a=5,b=8;
        int Sum= IntStream.rangeClosed(a,b).sum();
        System.out.println(Sum);

    }
}
