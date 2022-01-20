package com.company;

import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class foodPickerFacade {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();
    FoodFactory foodFactory = new FoodFactory();

    public void foodPicker() {
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
            } else {
                System.out.println("We don't have that on the menu");
            }
        }
    }
}
