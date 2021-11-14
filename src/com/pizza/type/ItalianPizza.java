package com.pizza.type;

import com.pizza.Pizza;

public class ItalianPizza implements Pizza {

    @Override
    public void pizzaName() {
        System.out.println("Italian Pizza");
    }

    @Override
    public int pizzaPrice() {
        return 15000;
    }
}
