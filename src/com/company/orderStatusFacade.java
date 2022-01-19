package com.company;

import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class orderStatusFacade {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    public void orderStatus() {
        String orderLine = reader.readLine();

        while (true) {
            if (orderLine.equals("orderstatus")) {
                writer.write("Order status = In the making");
            }
        }
    }
}
