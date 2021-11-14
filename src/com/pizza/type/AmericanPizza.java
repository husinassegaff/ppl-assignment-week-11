package com.pizza.type;

import com.pizza.Pizza;

public class AmericanPizza implements Pizza {

    @Override
    public void pizzaName() {
        System.out.println("American Pizza");
    }

    @Override
    public int pizzaPrice() {
        return 20000;
    }
}
