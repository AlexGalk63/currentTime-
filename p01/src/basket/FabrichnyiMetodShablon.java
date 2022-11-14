//package basket;
//
//import java.util.Date;
//
//public class FabrichnyiMetodShablon {
//    public static void main(String[] args) {
//////       Watch watch = new RomeWatch();
//////       watch.showTime();
////       WatchMAker maker = new DigitalWatchmaker();
//        WatchMAker mAker = getMakerByName("Digital");
//        Watch watch = mAker.createWatch();
//        watch.showTime();
//
//    }
//    public static WatchMAker getMakerByName(String maker){
//        if (maker.equals("Digital"))
//            return new DigitalWatchmaker();
//        else if (maker.equals("Rome"))
//            return new RomeWatchmaker();
//        throw new RuntimeException("Неподдерживаемая линия часов " + maker);
//    }
//}
//interface Watch{
//    void showTime();
//}
//class DigitalWatch implements Watch{
//
//
//    @Override
//    public void showTime() {
//        System.out.println(new Date());
//    }
//}
//class RomeWatch implements Watch{
//
//    @Override
//    public void showTime() {
//        System.out.println("VII-XX");
//    }
//}
//interface WatchMAker{
//    Watch createWatch();
//}
//class DigitalWatchmaker implements WatchMAker{
//
//    @Override
//    public Watch createWatch() {
//        return new DigitalWatch();
//    }
//}
//class RomeWatchmaker implements WatchMAker{
//
//    @Override
//    public Watch createWatch() {
//        return new RomeWatch();
//    }
//}