package com.company.foodTypes;

import com.company.Food;

public class Chicken implements Food {
    @Override
    public void call() {
        System.out.println("I'm chicken");
    }
}
