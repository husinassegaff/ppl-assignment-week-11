package com.pizza;

import com.pizza.topping.*;
import com.pizza.type.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" 🍕Pizza Hot Restaurant🍕");
        System.out.println("-----------------");
        System.out.println("A. Type of Pizza");
        System.out.println("################");
        System.out.println("1. Italian      : Rp 15000");
        System.out.println("2. American     : Rp 20000");

        System.out.print("\nChoose your pizza type : ");
        int type = Integer.parseInt(System.console().readLine());

        Pizza pizza = null;

        if (type == 1) {
            pizza = new ItalianPizza();
            System.out.println("\nYour pizza is : ");
            pizza.pizzaName();
        } else if (type == 2) {
            pizza = new AmericanPizza();
            System.out.println("\nYour pizza is : ");
            pizza.pizzaName();
        }

        System.out.println("\n\nB. Topping of Pizza");
        System.out.println("###################");
        System.out.println("1. Beef     : Rp 5000");
        System.out.println("2. Cheese   : Rp 3000");
        System.out.println("3. Chicken  : Rp 4000");
        System.out.println("4. Mushroom : Rp 3500");
        System.out.println("-----------------\n");

        System.out.print("How many topping do you want : ");
        int topping = Integer.parseInt(System.console().readLine());
        Topping toppingtype[] = new Topping[topping];
        int toppingsum = 0;

        for (int i = 0; i < topping; i++) {
            System.out.print("\nChoose your topping " + (i + 1) + " : ");
            int toppingType = Integer.parseInt(System.console().readLine());

            if (toppingType == 1) {
                toppingtype[i] = new Beef();
                toppingsum += new Beef().toppingPrice();
            } else if (toppingType == 2) {
                toppingtype[i] = new Cheese();
                toppingsum += new Cheese().toppingPrice();
            } else if (toppingType == 3) {
                toppingtype[i] = new Chicken();
                toppingsum += new Chicken().toppingPrice();
            } else if (toppingType == 4) {
                toppingtype[i] = new Mushroom();
                toppingsum += new Mushroom().toppingPrice();
            }
        }

        System.out.println("\nDetail Order");
        System.out.println("============");
        System.out.println("Pizza Type : ");
        pizza.pizzaName();
        System.out.println("\nPizza Price : Rp " + pizza.pizzaPrice());
        System.out.println("\nTopping : ");
        for (int i = 0; i < topping; i++) {
            System.out.println((i + 1) + ". ");
            toppingtype[i].toppingName();
            System.out.println("Price : Rp " + toppingtype[i].toppingPrice() + "\n");
        }
        System.out.println("Total Price : Rp " + (pizza.pizzaPrice() + toppingsum));

        System.out.println("Thank you for your order!");

    }
}
