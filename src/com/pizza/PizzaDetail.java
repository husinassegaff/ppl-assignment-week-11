package com.pizza;

public class PizzaDetail implements Pizza {

    protected Pizza pizza;

    public PizzaDetail(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void pizzaName() {
        pizza.pizzaName();
    }

    @Override
    public int pizzaPrice() {
        return pizza.pizzaPrice();
    }

}
