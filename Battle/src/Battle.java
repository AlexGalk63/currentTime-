import java.util.Arrays;

public class Battle {

    public static void main(String[] args) {
        WarriorService warriorService = new WarriorService();
//        Warrior wik = new Archer(WarriorService.getName());
//        Warrior wik2 = new Viking(WarriorService.getName());
//        wik2.takeDamage(wik.attack());
//        String s = new String(wik2.toString());
//        String s2 = new String(wik2.clone().toString());
//        System.out.println(s);
//        System.out.println(s2);
        Squad squad = new Squad("Перцы", new Warrior[]{warriorService.generateWarrior()});
        System.out.println(Arrays.toString(squad.generateSquad().getWarriors()));
        squad.hasAliveWarriors(squad);

    }
}
interface Warrior{
    boolean alive = true;
    int attack();
    abstract void takeDamage(int damage);
    default boolean isAlive(){return alive;};
    void setSquadName(String name);
    Object clone();



}
class Viking implements Warrior{
    private String name;

    private int vikingHealth = 100;
    private final int vikingDamage = 50;

    private String squadName;

    public Viking(String name) {
        this.name = name;
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
        return new Viking(WarriorService.getName());
    }
    @Override
    public String toString(){
        return "Warrior [name =" + WarriorService.getName() + ", squadName =" + Squad.squadName + ", тип воина = Викинг]" + "\n";
    }
}
class Archer implements Warrior{
    private String name;

    private int archerHealth = 80;
    private final int archerDamage = 80;
    private String squadName;

    public Archer(String name) {
        this.name = WarriorService.getName();

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
        else if (archerHealth < 0)
            System.out.println("Боец мёртв");
        return false;
    }

    @Override
    public void setSquadName(String name) {
        this.squadName = squadName;
    }

    @Override
    public Object clone() {
        return new Archer(WarriorService.getName());
    }
    @Override
    public String toString(){
        return "Warrior [name =" + WarriorService.getName() + ", squadName =" + Squad.squadName + ", тип воина = Лучник]"+ "\n";
    }
}

