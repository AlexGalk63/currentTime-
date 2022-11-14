//package basket;
//
//public class TsepochkaOtvetstvennostyShablon {
//    public static void main(String[] args) {
//        Logger logger0 = new SMSLogger(Level.ERROR);
//        Logger logger1 = new FileLogger(Level.DEBUG);
//        Logger logger2 = new EmailLogger(Level.INFO);
//        logger0.setNext(logger1);
//        logger1.setNext(logger2);
//
//        logger0.writeMassage("Всё хорошо.", Level.INFO);
//        logger0.writeMassage("Идёт режим отладки", Level.DEBUG);
//        logger0.writeMassage("Система упала.", Level.ERROR);
//
//    }
//}
//
//
//class Level{
//    public static final int ERROR = 1;
//    public static final int DEBUG = 2;
//    public static final int INFO = 3;
//}
//abstract class Logger{
//    int priority;
//    public Logger(int priority) {this.priority = priority;}
//    Logger next;
//    public void setNext(Logger next) {this.next = next;}
//
//    public void writeMassage(String massage, int level) {
//        if (level<=priority) {write(massage);}
//        if (next != null) {next.writeMassage(massage, level);}
//    }
//    abstract void write(String massage);
//}
//class SMSLogger extends Logger {
//    public SMSLogger(int priority) {super(priority);}
//    public void write(String massage){System.out.println("СМС: " + massage);}
//}
//class FileLogger extends Logger {
//    public FileLogger(int priority) {super(priority);}
//
//    public void write(String massage){System.out.println("записываем в файл: " + massage);}
//}
//class EmailLogger extends Logger {
//    public EmailLogger(int priority) {super(priority);}
//
//    public void write(String massage){System.out.println("E-mail сообщение:  " + massage);}
//}






