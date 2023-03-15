package com.streams.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Output {
    public static void main(String[] args) {
        List<EmployeeDetails> emp=new ArrayList<>();
        emp.add(new EmployeeDetails(1,"anusha",26000));
        emp.add(new EmployeeDetails(2,"surya",22000));
        emp.add(new EmployeeDetails(3,"mohan",26000));
        List<EmployeeDetails> e=emp.stream()
                .filter(n->n.salary>25000)
                .collect(Collectors.toList());
        for (EmployeeDetails ep:e) {
            System.out.println(ep.name);

        }
    }
}
