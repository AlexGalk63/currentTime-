//package basket;
//
//public class DecoratorSHoblon {
//    public static void main(String[] args) {
//        PrinterInterface p = new QuoteDecorator(new LeftBacketDecorator(new RightBacketDecorator(new Printer("Privet"))));
////        PrinterInterface p = //new QuoteDecorator(new Printer("Privet"));//new Printer("Rfvjydgfdf");
//
//        p.print();
//        }
//
//    }
//
//interface PrinterInterface{
//    void print();
//}
//class Printer implements PrinterInterface{
//    String value;
//
//    public Printer(String value) {this.value = value;}
//    public void print(){
//        System.out.print(value);
//    }
//}
//abstract class Decorator implements PrinterInterface{
//    PrinterInterface component;
//
//    public Decorator(PrinterInterface component) {this.component = component;}
//    public void print(){
//        component.print();
//    }
//}
//class QuoteDecorator extends Decorator {
//
//
//    public QuoteDecorator(PrinterInterface component) {
//        super(component);}
//    public void print(){
//        System.out.print("\"");
//        super.print();
//        System.out.print("\"");
//    }
//
//}
//class LeftBacketDecorator extends Decorator {
//
//    public LeftBacketDecorator(PrinterInterface component) {super(component);}
//    public void print(){
//        System.out.print("[");
//        super.print();
//    }
//
//}
//class RightBacketDecorator extends Decorator{
//
//    public RightBacketDecorator(PrinterInterface component) {super(component);}
//    public void print(){
//        super.print();
//        System.out.print("]");
//    }
//
//}
