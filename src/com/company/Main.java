package com.company;

public class Main {

    public static void main(String[] args) {
        foodFacade foodFacade = new foodFacade(0);
        while (true) {
            foodFacade.foodPicker();
        }
    }
}
