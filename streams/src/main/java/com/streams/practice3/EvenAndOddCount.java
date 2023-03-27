package com.streams.practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenAndOddCount {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>(Arrays.asList(4,5,3,8,2,1,9));
        int e= (int) i.stream().filter(n->n%2==0).count();
        int o=(int) i.stream().filter(n->n%2==1).count();
        System.out.println(e+" "+o);
    }
}
