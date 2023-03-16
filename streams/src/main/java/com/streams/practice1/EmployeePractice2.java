package com.streams.practice1;

public class EmployeePractice2 {
    int num;
    String name;
    int age;
    String loc;

    @Override
    public String toString() {
        return "EmployeePractice2{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", loc='" + loc + '\'' +
                '}';
    }

    public EmployeePractice2(int num, String name, int age, String loc) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.loc = loc;

    }
}
