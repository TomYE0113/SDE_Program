package com.company.foodTypes;

import com.company.Food;

public class Burger implements Food {
    @Override
    public void call() {
        System.out.println("I'm a burger");
    }
}
