package servise;

import model.Capacity;
import model.Tasty;
import model.Topping;
import model.iceCream;

import java.util.Random;
import java.util.Scanner;

public class IceCreamService {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public iceCream createSurprise() {
        Capacity[] capacityes = Capacity.values();
        Tasty[] tasties = Tasty.values();

        iceCream iceCream1 = new iceCream(capacityes[random.nextInt(2)], tasties[random.nextInt(3)]);

        for (int i = 0; i < 2; i++) {
            int randomToppingIndex = random.nextInt(3);
            Topping[] topiings = Topping.values();
            iceCream.addTopping(topiings[randomToppingIndex]);


        }
        return iceCream1;

    }

    public iceCream createExtra() {
        return new iceCream(Capacity.HORN, Tasty.BANANA);
    }

    private Capacity chooseCapacity() {
        System.out.println("Выберите тару");
        System.out.println("Нажмите 1 - чтобы выбрать рожок.");
        System.out.println("Нажмите 2 - чтобы выбрать стаканчик.");
        int choose = random.nextInt();
        Capacity[] allCapacities = Capacity.values();
        switch (choose) {
            case 1:
                return allCapacities[0];
            case 2:
                return allCapacities[1];
            default:
                System.out.println("Некорректное значение, попробуйте снова");
                return chooseCapacity();

        }
    }
}




