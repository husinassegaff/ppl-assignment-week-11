package com.pizza;

public class ToppingDetail implements Topping {

    protected Topping topping;

    public ToppingDetail(Topping topping) {
        this.topping = topping;
    }

    @Override
    public void toppingName() {
        topping.toppingName();
    }

    @Override
    public int toppingPrice() {
        return topping.toppingPrice();
    }
}
