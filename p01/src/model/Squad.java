package model;

import java.util.Random;

public class Squad {
    public static String squadName;
    Warrior warrior = new WarriorService().generateWarrior();
    WarriorService warriorService = new WarriorService();
    private Random random = new Random();

    public Squad(String pepers, Warrior warrior) {};
    public Squad(String squadname) {};
    private String squadname;



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

    public Warrior getRandomWarrior(Squad squad) {
        for (int i = 0; i < getWarriors().length; i++) {
            if (getWarriors()[i].isAlive())
                return warriors[i];
            else i++;
        }
        return getRandomWarrior(squad);
    }

    public boolean hasAliveWarriors(Squad squad) {
        for (int i = 0; i < squad.getWarriors().length; i++)
            if (squad.getWarriors()[i].isAlive())
                System.out.println("В этом отряде есть живые бойцы");
            else {

                System.out.println("В этом отряде все мертвы");
            }
        return false;
    }





        //        System.out.println(Arrays.toString(squad.generateSquad().getWarriors()));

//    public void goin(Room room) {
//        if (room.getPersons().length > 0) {
//            for (int i = 0; i < room.getPersons().length; i++) {
//                if (!room.getPersons()[i].isAtHome()) {
//                    if (room.getPersons()[i].getAge() > 25) {
//                        Person person = room.getPersons()[i];
//                        person.setAtHome(true);
//                        System.out.println(person.getName() + " Пришёл с работы.");
//                        return;
        @Override
        public Object clone () {
            return new Squad(squadName, warriors.clone());
        }
        @Override
        public String toString () {
            return "Squad [name =" + squadName + " ]";
        }
    }

