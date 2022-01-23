package com.company.states;

import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;
import com.company.orderState;

public class waitingState implements orderState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    com.company.foodFacade foodFacade;
    int count;

    public waitingState(com.company.foodFacade foodFacade, int count) {
        this.foodFacade = foodFacade;
        this.count = count;
    }

    @Override
    public void foodPicker() {
        writer.write("Welcome! Can I take your order please? (yes/no)");
        String answer = reader.readLine();

        if (answer.equals("yes")) {
            this.foodFacade.changeState(new makingState(this.foodFacade, this.count), this.count);
        } else if (answer.equals("no")) {
            writer.write("Okay, have a nice day!");
            System.exit(1);
        } else {
            writer.write("That is not a valid answer");
        }
    }
}
