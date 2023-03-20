package com.example.designPattern.FactoryPattern.factorypattern2;

public class IceCreamFactory {
    public static IceCream getInstance(String type) {

        switch (type) {

            case "1":
                return new Vanilla();
            case "2":
                return new Strawberry();
            case "3":
                return new Chocolate();

        }
        return null;
    }
}
