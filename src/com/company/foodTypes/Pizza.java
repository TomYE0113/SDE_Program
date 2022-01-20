package com.company.foodTypes;

import com.company.Food;

public class Pizza implements Food {
    @Override
    public void call() {
        System.out.println("You ordered a pizza");
    }
}
