package com.streams.practice23;

public class Employee {
    int age;
    int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }
}
