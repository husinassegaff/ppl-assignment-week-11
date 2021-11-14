package com.pizza.topping;

import com.pizza.Topping;

public class Cheese implements Topping {

    @Override
    public void toppingName() {
        System.out.println("Cheese");
    }

    @Override
    public int toppingPrice() {
        return 3000;
    }
}
