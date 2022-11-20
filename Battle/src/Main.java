public class Main {
    public static void main(String[] args) {
        //старт битвы инициализация объекта
        DateHelper helper = new DateHelper();

        //выводим дату старта
        System.out.printf("Start: %s%n", helper.getFormattedStartDate());

        //выводим текущую дату
        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());

        //делаем скпи времени
        System.out.println("Do skip time 1");
        helper.skipTime();
        //выводим текущую дату
        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());

        //делаем скпи времени
        System.out.println("Do skip time 2");
        helper.skipTime();
        //выводим текущую дату
        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());

        //делаем скпи времени
        System.out.println("Do skip time 3");
        helper.skipTime();
        //выводим текущую дату
        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());

        System.out.println("after skip");
        System.out.printf("Diff: %s%n", helper.getFormattedDiff());
    }
}