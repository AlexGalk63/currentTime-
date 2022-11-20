import java.util.Arrays;

public class Battle {
    public static void main(String[] args) {

    }
}
interface Warrior{
    boolean alive = true;
    int attack();
    void takeDamage(int damage);
    default boolean isAlive(){return alive;};
    void setSquadName(String name);
    Object clone();
}
class Viking implements Warrior{
    private String name;

    private int vikingHealth = 100;
    private final int vikingDamage = 50;

    private String squadName;

    public Viking(String name, int vikingHealth, String squadName) {
        this.name = WarriorService.getName();
        this.vikingHealth = vikingHealth;
        this.squadName = Squad.squadName;
    }


    @Override
    public int attack() {
        return vikingDamage;
    }
    @Override
    public void takeDamage(int damage) {
        vikingHealth -= damage;
    }

    @Override
    public boolean isAlive() {
        if (vikingHealth > 0)
            return alive;
        else System.out.println("Боец мёртв");
        return false;
    }

    @Override
    public void setSquadName(String name) {
        name = squadName;
    }
    @Override
    public Object clone() {
        return new Viking(name,100, squadName);
    }
    @Override
    public String toString(){
        return "Warrior [name =" + name + ", squadName =" + squadName + ", тип воина = Викинг]" + "\n";
    }
}
class Archer implements Warrior{
    private String name;

    private int archerHealth = 80;
    private final int archerDamage = 80;
    private String squadName;

    public Archer(String name, int archerHealth, String squadName) {
        this.name = WarriorService.getName();
        this.archerHealth = archerHealth;
        this.squadName = Squad.squadName;
    }


    @Override
    public int attack() {
        return archerDamage;
    }
    @Override
    public void takeDamage(int damage) {
        archerHealth -= damage;
    }

    @Override
    public boolean isAlive() {
        if (archerHealth > 0)
            return alive;
        else if (archerHealth <= 0)
            System.out.println("Боец мёртв");
        return false;
    }

    @Override
    public void setSquadName(String name) {
        name = squadName;
    }

    @Override
    public Object clone() {
        return new Archer(name,80, squadName);
    }
    @Override
    public String toString(){
        return "Warrior [name =" + name + ", squadName =" + squadName + ", тип воина = Лучник]"+ "\n";
    }
}

