package com.example.designPattern.FactoryPattern.factorypattern2;

import java.util.*;

public class FactoryPattern {
    public static void main(String[] args) {
        System.out.println("Enter your choice of ice cream");
        System.out.println("1-vanilla, 2- strawberry, 3- chocolate, 4- exit\n");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("Enter your choice of toppings");
        String topping = scanner.nextLine();

        IceCream iceCream = null;
        while (!type.equalsIgnoreCase("4")) {
            System.out.println("\n Enter your choice of ice cream:");
            type = scanner.nextLine();
            if (!type.equalsIgnoreCase("4")) {
                System.out.println("\n Enter your choice of toppings:");
                topping = scanner.nextLine();
            }
            iceCream = IceCreamFactory.getInstance(type);
            iceCream.setToppings(topping);
            iceCream.prepare();

        }
        System.out.println("\nThank You ");

    }
}
