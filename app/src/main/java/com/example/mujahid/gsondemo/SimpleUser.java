package com.example.mujahid.gsondemo;

/**
 * Created by Mujahid on 1/24/2018.
 */

public class SimpleUser {

    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;

    private UserAddress address;

    public SimpleUser(String name, String email, int age, boolean isDeveloper, UserAddress address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.isDeveloper = isDeveloper;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public UserAddress getAddress() {
        return address;
    }
}
