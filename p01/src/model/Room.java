package model;

public class Room {
    private Person[] persons;

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Room(Person[] persons) {
        this.persons = persons;
    }
}
