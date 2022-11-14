package model;

public class Person {
    private boolean male;
    private String name;
    private int age;
    private boolean atHome = true;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAtHome() {
        return atHome;
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;
    }

    public Person(boolean male, String name, int age) {
        this.male = male;
        this.name = name;
        this.age = age;

    }


}
