package com.example.designPattern.FactoryPattern.factorypattern2;

public class Vanilla implements IceCream {

    private final String ingredient;
    private String toppings;

    public Vanilla() {
        ingredient = "full fat milk, corn starch + 2 tablespoon milk, vanilla extract and sugar";
    }

    @Override
    public void prepare() {
        System.out.println("Vanilla Ice Cream is prepared with following ingredient: " + ingredient
                + (this.toppings != null && !this.toppings.isEmpty() ? (" and with toppings " + this.toppings)
                : " and without toppings"));

    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

}

