//package basket;
//
//public class MostShablon {
//    public static void main(String[] args) {
//        Car c = new Sedan(new Shkoda());
//        c.showDetails();
//        Car c2 = new Hatchback(new Kia());
//        c2.showDetails();
//        Car c3 = new Hatchback(new Mersedes());
//        c3.showDetails();
//        Car c4 = new Coupe(new Mersedes());
//        c4.showDetails();
//
//    }
//}
//abstract class Car{
//    Make make;
//    public Car(Make m){make = m;}
//    abstract void showType();
//    void showDetails(){
//        showType();
//        make.setMake();
//    }
//
//}
//class Sedan extends Car{
//    public Sedan(Make m) {
//        super(m);
//    }
//    @Override
//    void showType() {
//        System.out.println("Sedan");
//
//    }
//}
//class Coupe extends Car{
//
//    public Coupe(Make m) {
//        super(m);
//    }
//    @Override
//    void showType() {
//        System.out.println("Coupe");
//    }
//}
//class Hatchback extends Car{
//
//    public Hatchback(Make m) {
//        super(m);
//    }
//    @Override
//    void showType() {
//        System.out.println("Hatchback");
//    }
//}
//interface Make {
//    void setMake();
//}
//class Kia implements Make{
//    @Override
//    public void setMake() {
//        System.out.println("Kia");
//    }
//}
//class Shkoda implements Make {
//    @Override
//    public void setMake() {
//        System.out.println("Shkoda");
//    }
//}
//class Mersedes implements Make {
//    @Override
//    public void setMake() {
//        System.out.println("Mersedes");
//    }
//}