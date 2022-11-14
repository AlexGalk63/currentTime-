package servise;

import model.Person;
import model.Room;

import java.util.Random;

public class RoomService {
    private PersonService personService = new PersonService();
    private Random random = new Random();

    public Room generateRoom(){
        int personcount = random.nextInt(5);
        Person[] persons = new Person[personcount];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = personService.generatePerson();
        }
        return new Room(persons);
    }
}
