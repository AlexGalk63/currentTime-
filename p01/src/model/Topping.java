package model;

import model.iceCream;

import java.util.Random;

public enum Topping {
    NUTS("Орехи", 7.5),
    CHOKOLATE("ШОКОЛАД", 8.5),
    FRUITS("Фрукты", 9.5),
    SIROP("Сироп", 9.0),
    ;

    private final String name;
    private final double cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }



    Topping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}


