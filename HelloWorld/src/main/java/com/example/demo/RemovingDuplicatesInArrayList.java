package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicatesInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>(Arrays.asList(1,5,1,2,6,7,6));
        HashSet<Integer> i=new HashSet<>();
        for (int j=0;j<li.size();j++){
            i.add(li.get(j));
        }
        System.out.println(i);
        for (int k=0;k<li.size();k++){
            for (int x=k+1;x<li.size();x++){
                int a=li.get(k);
                if(a==li.get(x)) {
                    li.remove(li.get(x));
                }


            }

        }
        System.out.println(li);
    }
}
