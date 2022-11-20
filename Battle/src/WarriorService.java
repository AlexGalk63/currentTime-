import java.util.Random;

public class WarriorService {
    static Random random = new Random();
    private final Warrior[] warriors = {generateArcher(), generateViking()};

    private static final String[] warriorNames = {"Karl", "Magnus", "Don"};

    private Warrior generateViking() {
        return new Viking(getName(),100, Squad.squadName);
    }


    private Warrior generateArcher() {
        return new Archer(getName(),80, Squad.squadName);

    }

    public Warrior generateWarrior() {
        return new WarriorService().getType();
    }

    private Warrior getType() {
        int randomArrayPosition = random.nextInt(warriors.length);
        return warriors[randomArrayPosition];
    }

    public static String getName() {
        int randomArrayPosition = random.nextInt(warriorNames.length);
        return warriorNames[randomArrayPosition];

    }
}
