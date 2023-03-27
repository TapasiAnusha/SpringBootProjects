package com.streams.practice23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonOutput {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("surya", 23));
        p.add(new Person("subbu", 35));
        p.add(new Person("anu", 22));
        Optional<Person> pe = p.stream().filter(n -> n.getName().startsWith("s")).sorted(Comparator.comparingInt(Person::getAge).reversed()).findFirst();
            System.out.println(pe.get().getName());
    }
}
