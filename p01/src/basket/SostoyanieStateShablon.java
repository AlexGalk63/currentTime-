package basket;

//public class SostoyanieStateShablon {
//    public static void main(String[] args) {
////        чуть сложнее пример
//        Human human = new Human();
//        human.setState(new Work());
//        for (int i = 0; i < 10; i++) {
//            human.doSomething();
//        }
//
//    }
//}
//class Human {
//    private Activity state;
//
//    public void setState(Activity s) {
//        this.state = s;
//    }
//
//    public void doSomething() {
//        state.doSomething(this);
//    }
//}
//interface Activity{
//    void doSomething(Human context);
//}
//class Work implements Activity{
//    public void doSomething(Human context){
//        System.out.println("Работаем!!!");
//        context.setState(new WeekEnd());
//    }
//}
//class WeekEnd implements Activity{
//    private int count = 0;
//    public void doSomething(Human context){
//        if (count < 3){
//            System.out.println("Отдыхаем Zzz");
//            count++;
//        }
//            else {
//                context.setState(new Work());
//        }
//    }
//}

////        простой пример
//        Station dfm = new RadioDFM();
//        Radio radio = new Radio();
//        radio.setStation(dfm);
//
//        for (int i = 0; i < 10; i++) {
//            radio.play();
//            radio.nextStation();
//
//
//        }
//
//    }
//}
//interface Station{
//    void play();
//}
//class Radio7 implements Station{    public void play(){System.out.println("Играет Радио 7...");}
//}
//class RadioDFM implements Station{    public void play(){System.out.println("Играет Радио DFM...");}
//}
//class VestyFM implements Station{    public void play(){System.out.println("Играет Радио VestyFM...");}
//}
//class Radio {
//    Station station;
//
//    void setStation(Station st) {
//        station = st;
//    }
//
//    void nextStation() {
//        if (station instanceof Radio7) {
//            setStation(new RadioDFM());
//        } else if (station instanceof RadioDFM) {
//            setStation(new VestyFM());
//        } else if (station instanceof VestyFM) {
//            setStation(new Radio7());
//        }
//    }
//    void play() {
//        station.play();
//    }
//}
