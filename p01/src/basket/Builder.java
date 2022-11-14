package basket;

public class Builder {
    public static void main(String[] args) {
//        Car car= new CarBuilder()
//                .buildMake("Mersedes")
//                .buildTransmision(Transmission.AUTO)
//                .buildMaxspeed(280)
//                        .build();
//        System.out.println(car);
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.BuildCar();
        System.out.println(car);

    }
}

    enum Transmission{
        MANUAL, AUTO
    }
 class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {this.make = make;}
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

     public String toString(){
        return "Car [make =" + make + ", tramsmission =" + transmission + ", maxspeed =" + maxSpeed + "]";
     }
}
abstract class CarBuilder{
    Car car;
    void creatCar(){car = new Car();}
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxspeed();

    Car getCar(){return car;}
}
class FordMondeoBuilder extends CarBuilder{

    @Override
    void buildMake() {car.setMake("Ford Mondeo");}
    @Override
    void buildTransmission() {car.setTransmission(Transmission.AUTO);}
    @Override
    void buildMaxspeed() {car.setMaxSpeed(260);}
}
class SubaruBuilder extends CarBuilder {

    @Override
    void buildMake() {        car.setMake("Subaru");}
    @Override
    void buildTransmission() {        car.setTransmission(Transmission.MANUAL);}
    @Override
    void buildMaxspeed() {car.setMaxSpeed(290);}
}
class Director{
    CarBuilder builder;
    void setBuilder(CarBuilder b){builder = b;}
    Car BuildCar(){
        builder.creatCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxspeed();
        Car car = builder.getCar();
        return car;
    }

}
// class CarBuilder{
//    String m = "Default";
//    Transmission t = Transmission.MANUAL;
//    int s = 120;
//
//    public CarBuilder buildMake(String m){
//        this.m = m;
//        return this;
//    }
//    CarBuilder buildTransmision(Transmission t) {
//        this.t = t;
//        return this;}
//    CarBuilder buildMaxspeed(int s){
//        this.s = s;
//        return this;}
//    Car build(){
//        Car car = new Car();
//        car.setMake(m);
//        car.setTransmission(t);
//        car.setMaxSpeed(s);
//        return car;
//    }
//}