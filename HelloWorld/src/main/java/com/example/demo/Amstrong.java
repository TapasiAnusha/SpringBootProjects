package com.example.demo;

public class Amstrong {
    public static void main(String[] args) {
        int n=371;int t=n;
        int x=String.valueOf(n).length();
        double result=0;
        while (n!=0){
            int r=n%10;
            result=result+Math.pow(r,x);
            n=n/10;

        }
        System.out.println(result);
        if(result==t)
            System.out.println("armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
