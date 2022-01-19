package com.company;

import com.company.foodTypes.Burger;
import com.company.foodTypes.Chicken;
import com.company.foodTypes.Pizza;

public class FoodFactory {
    public Food getFood(String foodType){
        if(foodType == null){
            return null;
        }
        if(foodType.equalsIgnoreCase("PIZZA")){
            return new Pizza();

        } else if(foodType.equalsIgnoreCase("BURGER")){
            return new Burger();

        } else if(foodType.equalsIgnoreCase("CHICKEN")){
            return new Chicken();
        }

        return null;
    }
}
