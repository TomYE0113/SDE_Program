package com.company;

public class Main {

    public static void main(String[] args) {
        foodPickerFacade foodPickerFacade = new foodPickerFacade();
        foodPickerFacade.foodPicker();

        orderStatusFacade orderStatusFacade = new orderStatusFacade();
        orderStatusFacade.orderStatus();
    }
}
