package servise;

import model.iceCream;

import java.util.Random;
import java.util.Scanner;

public class TerminalService {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private final IceCreamService iceCreamService = new IceCreamService();

    public void mainTerminal() {
        iceCream iceCream1 = ChoiseIceCream();
        double cost = iceCream.getCost();
        System.out.println("Цена " + cost + " руб.");
        System.out.println("Ваше мороженное готово, приятного аппетта!");

    }

    public iceCream ChoiseIceCream() {
        System.out.println("Нажмите 1 - чтобы выбрать мороженное Сюрприз");
        System.out.println("Нажмите 2 - чтобы выбрать классическое мороженное");
        System.out.println("Нажмите 1 - чтобы выбрать мороженное Экстра");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                return iceCreamService.createSurprise();
//            case 2:
            default:
                System.out.println("Некорректное значение попробуйте снова!");
                return ChoiseIceCream();
        }
    }
}


