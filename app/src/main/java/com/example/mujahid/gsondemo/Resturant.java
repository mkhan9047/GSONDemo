package com.example.mujahid.gsondemo;

import java.util.List;

/**
 * Created by Mujahid on 1/24/2018.
 */

public class Resturant {

    private  String name;

    ResturantOwner owner;

    ResturantStaff cook;

    ResturantStaff waiter;

    List<ResturantMenuItem> items;

    public Resturant(String name, ResturantOwner owner, ResturantStaff cook, ResturantStaff waiter, List<ResturantMenuItem> items)  {
        this.name = name;
        this.items = items;
        this.owner = owner;
        this.cook = cook;
        this.waiter = waiter;
    }

      static class ResturantOwner {
        String name;
        UserAddress address;

        public ResturantOwner(String name, UserAddress address) {
            this.name = name;
            this.address = address;
        }

    }

     static class ResturantStaff {
        int age;
        String name;
        int salary;

        public ResturantStaff(int age, String name, int salary) {
            this.age = age;
            this.name = name;
            this.salary = salary;
        }

    }

    public   static  class ResturantMenuItem {
        String name;
        float price;
        boolean isAviable;

        public ResturantMenuItem(String name, float price, boolean isAviable) {
            this.name = name;
            this.price = price;
            this.isAviable = isAviable;
        }
    }
}
