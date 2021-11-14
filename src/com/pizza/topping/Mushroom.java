package com.pizza.topping;

import com.pizza.Topping;

public class Mushroom implements Topping {

    @Override
    public void toppingName() {
        System.out.println("Mushroom");
    }

    @Override
    public int toppingPrice() {
        return 3500;
    }
}
