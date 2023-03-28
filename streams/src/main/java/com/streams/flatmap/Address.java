package com.streams.flatmap;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
