package model;
import java.util.Arrays;


public class iceCream {
    private Capacity capacity;
    private static final Topping[] toppings = new Topping[4];
    private static Tasty tasty;

    public iceCream(Capacity capacity, Tasty tasty) {
        this.capacity = capacity;
        this.tasty = tasty;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    public Tasty getTasty() {
        return tasty;
    }

    public void setTasty(Tasty tasty) {
        this.tasty = tasty;
    }

    public static void addTopping(Topping topping) {
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] == null) {
            toppings[i] = topping;
            return;
        }
        }
        System.out.println("Выбрано мааксимальное количество топинга.");
    }

    public static double getCost() {
        double price = 0;
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                price = price + toppings[i].getCost();
            }

        }
        price = price + tasty.getCost();
        return price;
    }
}
















