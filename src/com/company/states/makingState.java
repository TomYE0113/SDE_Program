package com.company.states;

import com.company.*;
import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class makingState implements orderState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    FoodFactory foodFactory = new FoodFactory();
    com.company.foodFacade foodFacade;
    int count;

    public makingState(foodFacade foodFacade, int count) {
        this.foodFacade = foodFacade;
        this.count = count;
    }

    @Override
    public void foodPicker() {
        writer.write("What would you like to eat? (pizza/burger/chicken)");
        String food = reader.readLine();

        if (food.equals("pizza")) {
            Food pizza = foodFactory.getFood("PIZZA");
            pizza.call();
            this.prepareFood();
        } else if (food.equals("burger")) {
            Food burger = foodFactory.getFood("BURGER");
            burger.call();
            this.prepareFood();
        } else if (food.equals("chicken")) {
            Food chicken = foodFactory.getFood("CHICKEN");
            chicken.call();
            this.prepareFood();
        } else {
            System.out.println("We don't have that on the menu");
        }
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void prepareFood() {
        wait(5000);
        writer.write("Order status: In the making");
        wait(7000);
        writer.write("Order status: Food is finished");
        this.foodFacade.changeState(new finishedState(this.foodFacade, this.count), this.count);
    }
}
