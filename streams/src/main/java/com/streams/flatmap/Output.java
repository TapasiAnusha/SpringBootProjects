package com.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Output {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", Arrays.asList(
                        new Address("123 Main St", "New York", "USA"),
                        new Address("456 Oak Ave", "San Francisco", "USA"))),
                new Person("Jane", Arrays.asList(
                        new Address("789 Park Blvd", "Los Angeles", "USA"),
                        new Address("101 Elm St", "Chicago", "USA")))
        );
        List<String> cities = persons.stream()
                .flatMap(p -> p.getAddress().stream())
                .map(Address::getCity)
                .collect(Collectors.toList());
        System.out.println(cities);
    }
}
