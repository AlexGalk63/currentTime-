import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        DateHelper helper = new DateHelper();
        System.out.println("Start:" + helper.getFormattedStartDate());
        Squad squad1 = new Squad("Перцы");
        squad1.generateSquad();
        Squad squad2 = new Squad("Овощи");
        squad2.generateSquad();
        Warrior w1 = squad1.getRandomWarrior();
        Warrior w2 = squad2.getRandomWarrior();
        int healthWr1 = w1.takeDamage(w2.attack());
        int healthWr2 = w2.takeDamage(w1.attack());
        helper.skipTime();
        TimerTask attackMoment1 = new TimerTask() {
            @Override
            public void run() {
                w1.takeDamage(w2.attack());
            }
        };
        Timer attackDelay = new Timer();
        long delay = 0;
        long intervalAttack = 25 * 1000;
        attackDelay.scheduleAtFixedRate(attackMoment1, delay, intervalAttack);
        helper.skipTime();
        if (!w2.isAlive()) System.out.println("победитель: " + squad1);
        if (w2.isAlive()) {
            TimerTask attackMoment2 = new TimerTask() {
                @Override
                public void run() {
                    w2.takeDamage(w1.attack());
                }
            };
            Timer attackDelay2 = new Timer();
            long delay2 = 0;
            long intervalAttack2 = 25 * 1000;
            attackDelay2.scheduleAtFixedRate(attackMoment2, delay2, intervalAttack2);
        }
        if (!w1.isAlive()) System.out.println("победитель: " + squad2);
        helper.getFormattedCurrentDate();
        System.out.println("Битва длилась: " + helper.getFormattedDiff() + " минут.");
    }
}



//        //старт битвы инициализация объекта
//        DateHelper helper = new DateHelper();
//
//        //выводим дату старта
//        System.out.printf("Start: %s%n", helper.getFormattedStartDate());
//
//        //выводим текущую дату
//        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());
//
//        //делаем скпи времени
//        System.out.println("Do skip time 1");
//        helper.skipTime();
//        //выводим текущую дату
//        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());
//
//        //делаем скпи времени
//        System.out.println("Do skip time 2");
//        helper.skipTime();
//        //выводим текущую дату
//        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());
//
//        //делаем скпи времени
//        System.out.println("Do skip time 3");
//        helper.skipTime();
//        //выводим текущую дату
//        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());
//
//        System.out.println("after skip");
//        System.out.printf("Diff: %s%n", helper.getFormattedDiff());
//
//        Squad squad = new Squad("1 squard");
//        Squad clone = new Squad(squad);
//        squad.generateSquad();
//        squad.clone();
//        System.out.println();
//
//        Warrior firstWarrior = squad.getRandomWarrior();
//        System.out.printf("Name First Warrior: %s%n", firstWarrior.toString());
//        firstWarrior.takeDamage(100);
//
//        Warrior secondWarrior = squad.getRandomWarrior();
//        System.out.printf("Name First Warrior: %s%n", secondWarrior.toString());
//
//    }
//}