package com.streams.practice23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOutput {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee(21,26000));
        e.add(new Employee(31,30000));
        e.add(new Employee(32,20000));
        List<Employee>emp=e.stream().filter(n->n.getAge()>30).collect(Collectors.toList());
        int avg=emp.stream().map(n->n.getSalary()).reduce(Integer::sum).get()/(emp.size());
        System.out.println(avg);
    }
}
