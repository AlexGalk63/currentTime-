package servise;

import model.Person;

import java.util.Random;

public class PersonService {
    private String[] womanNames = {"Yulya", "Mary", "Dasha"};
    private String[] manNames = {"Petr", "Alexandr", "Mihail"};
    private Random random = new Random();

    public Person generatePerson() {

        boolean male = random.nextBoolean();
        int age = random.nextInt(80);
        return new Person(male, getName(male),age );

    }

    private String getName(boolean male) {
        if (male){
            int randomArrayPosition = random.nextInt(manNames.length-1);
            return manNames[randomArrayPosition];
        }
        else {
            int randomArrayPosition = random.nextInt(womanNames.length-1);
            return womanNames[randomArrayPosition];
        }

    }



}
