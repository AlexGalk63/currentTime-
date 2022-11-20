import java.util.ArrayList;
import java.util.Random;

public class Squad {
    public static String squadName;
    WarriorService warriorService = new WarriorService();

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    private Warrior[] warriors;

    public Warrior[] getWarriors() {
        return warriors;
    }

    public void setWarriors(Warrior[] warriors) {
        this.warriors = warriors;
    }


    public Squad(String squadName) {
        this.squadName = squadName;
        int squadCount = new Random().nextInt(7, 10);
        warriors = new Warrior[squadCount];
    }

    public void generateSquad() {
        for (int i = 0; i < warriors.length; i++)
            warriors[i] = warriorService.generateWarrior();
    }

    public Warrior getRandomWarrior() {
        //нужно найти список живых бойцов
        ArrayList<Warrior> aliveWarriors = new ArrayList<>();

        //формируем списко живых бойцов
        for (int i = 0; i < warriors.length; i++) {
            if (warriors[i].isAlive()) {
                aliveWarriors.add(warriors[i]);
            }
        }

        //возвращаем случайного живого бойца из списка живых
        if (aliveWarriors.size() > 0) {
            int rnd = new Random().nextInt(0, aliveWarriors.size() - 1);
            return aliveWarriors.get(rnd);
        }
        return null;
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < getWarriors().length; i++)
            if (warriors[i].isAlive())
                return warriors[i].isAlive();
            else {
                return false;
            }
        return true;
    }
}



