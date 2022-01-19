package com.company;

import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class Main {

    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();
        FoodFactory foodFactory = new FoodFactory();

        while(true) {
            writer.write("What would you like to eat?");
            String food = reader.readLine();

            if (food.equals("Pizza")) {
                Food pizza = foodFactory.getFood("PIZZA");
                pizza.call();
            } else if (food.equals("Burger")) {
                Food pizza = foodFactory.getFood("BURGER");
                pizza.call();
            } else if (food.equals("Chicken")) {
                Food chicken = foodFactory.getFood("CHICKEN");
                chicken.call();
            }
        }
    }
}
