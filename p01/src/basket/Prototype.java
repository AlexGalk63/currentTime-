//package basket;
//
//public class Prototype {
//    public static void main(String[] args) {
//        Human original = new Human(18, "Vasya");
//        System.out.println(original);
//
//        Human copy = (Human) original.copy();
//        System.out.println(copy);
//
//        HumanFactory factory = new HumanFactory(copy);
//        Human h1 = factory.MakeCopy();
//        System.out.println(h1);
//
//        factory.setPrototype(new Human(30,"Валерия"));
//        Human h2 = factory.MakeCopy();
//        System.out.println(h2);
//
//    }
//}
//interface Copible{
//    Object copy();
//}
//class Human implements Copible{
//    int age;
//    String name;
//
//    public Human(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//    public String toString(){
//        return "Human [ age: " + age + " name: "+ name + "]";
//    }
//
//    @Override
//    public Object copy() {
//        Human copy = new Human(age, name);
//        return copy;
//    }
//}
//class HumanFactory{
//    Human human;
//
//    public HumanFactory(Human human) {
//        this.human = human;
//    }
//
//    public void setPrototype(Human human) {
//        this.human = human;
//    }
//    Human MakeCopy(){
//        return (Human)human.copy();
//    }
//}
//



