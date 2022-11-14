//package basket;
//
//import javax.imageio.IIOException;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ObserverShablon {
//    public static void main(String[] args) {
//        MeteoStantion stantion = new MeteoStantion();
//        stantion.addObserver(new ConsoleObserver());
//        stantion.addObserver(new FileObserver());
//        stantion.setMeasurements(25,760);
//        stantion.setMeasurements(-5,745);
//
//    }
//}
//interface Observed{
//    void addObserver(Observer o);
//    void removeObserver(Observer o);
//    void notyfyObservers();
//}
//class MeteoStantion implements Observed{
//    int temperature;
//    int pressure;
//    List<Observer>observers = new ArrayList<>();
//    public void setMeasurements(int t, int p){
//        temperature = t;
//        pressure = p;
//        notyfyObservers();
//    }
//
//    @Override
//    public void addObserver(Observer o) {observers.add(o);}
//    @Override
//    public void removeObserver(Observer o) {observers.remove(o);}
//    @Override
//    public void notyfyObservers() {
//        for ( Observer o : observers){
//            o.handleEvent(temperature,pressure);
//        }
//    }
//}
//interface Observer{
//    void handleEvent(int temp, int presser);
//}
//class ConsoleObserver implements Observer{
//    public void handleEvent(int temp, int presser){
//        System.out.println("Погода изменилась. Температура: " + temp + " давление: " + presser + ".");
//    }
//}
//class FileObserver implements Observer{
//    public void handleEvent(int temp, int presser){
//        File f;
//        try {
//            f = File.createTempFile("TempPressure", "_txt");
//            PrintWriter pw = new PrintWriter(f);
//            pw.print("Погода изменилась. Температура: " + temp + " давление: " + presser + ".");
//            pw.println();
//            pw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
