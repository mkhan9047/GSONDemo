package com.example.mujahid.gsondemo;

/**
 * Created by Mujahid on 1/24/2018.
 */

public class UserAddress {

    private String street;
    private String houseNumber;
    private String city;
    private String country;

    public UserAddress(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
