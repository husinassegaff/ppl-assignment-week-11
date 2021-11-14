package com.pizza.topping;

import com.pizza.Topping;

public class Beef implements Topping {

    @Override
    public void toppingName() {
        System.out.println("Beef");
    }

    @Override
    public int toppingPrice() {
        return 5000;
    }

}
