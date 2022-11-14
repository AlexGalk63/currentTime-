//package basket;
//
//public class Fasade {
//    public static void main(String[] args){
//        DeviceFactory factory = getFactoryByCountryCode("ENG");
//        Mouse m = factory.getMouse();
//        KeyBoard k = factory.getKeyBoard();
//        TouchPad t = factory.getTouchPad();
//
//        m.click();
//        k.print();
//        k.println();
//        t.Track(10,35);
//
//    }
//    private static DeviceFactory getFactoryByCountryCode(String lang){
//        return switch (lang) {
//            case "RU" -> new RuDeviceFactory();
//            case "ENG" -> new EnDeviceFactory();
//            default -> throw new RuntimeException("Unsupported country code " + lang);
//        };
//    }
//}
//interface Mouse{
//    void click();
//    void dblclick();
//    void scroll(int direction);
//}
//interface KeyBoard{
//    void print();
//    void println();
//}
//interface TouchPad{
//    void Track(int deltaX, int deltaY);
//}
//interface DeviceFactory{
//    Mouse getMouse();
//    KeyBoard getKeyBoard();
//    TouchPad getTouchPad();
//}
//class RuMouse implements Mouse{
//    public void click(){
//        System.out.println("Клик мышью.");
//    }
//    public void dblclick(){
//        System.out.println("Двойной клик мышью.");
//    }
//    public void scroll (int direction){
//        if (direction > 0)
//            System.out.println("Скролим вверх");
//        else if (direction < 0)
//            System.out.println("Скролим вниз");
//        else
//            System.out.println("Не скролим");
//    }
//}
//class RuKeyboard implements KeyBoard{
//    public void print(){
//        System.out.println("Печатаем строку.");
//    }
//    public void println(){
//        System.out.println("Печатаем строку с переносом.");}
//
//}
//class RuTouchpad implements TouchPad{
//    public void Track(int deltaX, int deltaY){
//        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
//        System.out.println("Мышь передвинулась на " + s + "пикселей.");
//    }
//}
//
//class EngMouse implements Mouse{
//    public void click(){
//        System.out.println("Click mouse.");
//    }
//    public void dblclick(){
//        System.out.println("Double Click mouse.");
//    }
//    public void scroll (int direction){
//        if (direction > 0)
//            System.out.println("Scroll up.");
//        else if (direction < 0)
//            System.out.println("Scroll down");
//        else
//            System.out.println("No  scrolling.");
//    }
//}
//class EngKeyboard implements KeyBoard {
//    public void print() {
//        System.out.println("Print string.");
//    }
//
//    public void println() {
//        System.out.println("Print string with transfer");
//    }
//}
//
//    class EngTouchpad implements TouchPad {
//        public void Track(int deltaX, int deltaY) {
//            int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
//            System.out.println("Mouse move to " + s + "pixels.");
//        }
//    }
//
//
//    class EnDeviceFactory implements DeviceFactory {
//        @Override
//        public Mouse getMouse() {
//            return new EngMouse();
//        }
//
//        @Override
//        public KeyBoard getKeyBoard() {
//            return new EngKeyboard();
//        }
//
//        @Override
//        public TouchPad getTouchPad() {
//            return new EngTouchpad();
//        }
//    }
//
//
//    class RuDeviceFactory implements DeviceFactory {
//        @Override
//        public Mouse getMouse() {
//            return new RuMouse();
//        }
//
//        @Override
//        public KeyBoard getKeyBoard() {
//            return new RuKeyboard();
//        }
//
//        @Override
//        public TouchPad getTouchPad() {
//            return new RuTouchpad();
//        }
//    }





