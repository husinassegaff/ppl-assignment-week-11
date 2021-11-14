package com.pizza.topping;

import com.pizza.Topping;

public class Chicken implements Topping {

    @Override
    public void toppingName() {
        System.out.println("Chicken");
    }

    @Override
    public int toppingPrice() {
        return 4000;
    }
}
