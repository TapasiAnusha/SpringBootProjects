package com.streams.flatmap;

import java.util.List;

public class Person {
    private String name;
    private List<Address> address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public Person(String name, List<Address> address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

}
