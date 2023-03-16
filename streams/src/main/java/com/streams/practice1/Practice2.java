package com.streams.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<EmployeePractice2> li=new ArrayList<>();
        li.add(new EmployeePractice2(2027,"anusha",22,"nan"));
        li.add(new EmployeePractice2(5671,"anu",21,"chennai"));
        li.add(new EmployeePractice2(5776,"surya",28,"chennai"));
        li.add(new EmployeePractice2(2764,"razee",20,"nn"));
        li.add(new EmployeePractice2(20097,"mohan",26,"chennai"));
        List<EmployeePractice2> emp=li.stream()
                .filter(employeePractice2 -> employeePractice2.loc=="chennai")
                .collect(Collectors.toList());
        System.out.println(emp);
    }
}
