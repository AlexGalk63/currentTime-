import java.util.Random;

public class Squad {
    public static String squadName;
    WarriorService warriorService = new WarriorService();
    Warrior warrior = new WarriorService().generateWarrior();
    private Random random = new Random();


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


    public Squad(String squadName, Warrior[] warriors) {
        this.squadName = squadName;
        this.warriors = warriors;
    }

    public Squad generateSquad() {
        int squadcount = random.nextInt(7, 10);
        Warrior[] warriors1 = new Warrior[squadcount];
        for (int i = 0; i < warriors1.length; i++) warriors1[i] = warriorService.generateWarrior();
        return new Squad(squadName, warriors1);
    }

    public Warrior getRandomWarrior() {
        for (int i = 0; i < getWarriors().length; i++) {
            if (getWarriors()[i].isAlive()){
                int warriorcount = random.nextInt(2);
                return warriors[warriorcount];
            }

        }

        public boolean hasAliveWarriors() {
            for (int i = 0; i < getWarriors().length; i++)
                if (getWarriors()[i].isAlive())
                    return warriors[i];
                else {
                    System.out.println("Все мертвы");
                }

        }
    }
}



