package model;

public enum Tasty {
    CHOKOLATE("Шоколад", 5.9),
    RASPBERY("Клубника", 6.6),
    BANANA("Банан",7.1),
    CHERRY("Вишня", 8.2),
    ;

    public double getCost() {
        return cost;
    }

    private double cost;

    public String getName() {
        return name;
    }

    private final String name;



    Tasty(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
