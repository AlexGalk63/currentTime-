//package basket;
//
//public class VizitorShablon {
//    public static void main(String[] args) {
//
//
//    }
//}
////        простая реализация
////        Element engine = new EngineElement();
////        Element body = new BodyElement();
////        Element car = new CarElement();
////        Visitor holy = new HooliganVisitor();
////
////        engine.accept(holy);
////        body.accept(holy);
////        чуть сложнее
//        Element car = new CarElement();
//        car.accept(new HooliganVisitor());
//
//        System.out.println();
//
//        car.accept(new MehanikVisitor());
//
//
//    }
//}
//interface Visitor{
//    void visit(EngineElement engine);
//    void visit(BodyElement body);
//    void visit(CarElement car);
//    void visit(WheelElement wheel);
//}
//interface Element{
//    void accept(Visitor visitor);
//}
//class EngineElement implements Element{
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}
//class WheelElement implements Element{
//    private String name;
//    public WheelElement(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return this.name;
//    }
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}
//class CarElement implements Element {
//    Element[] elements;
//
//    public CarElement() {
//        this.elements = new Element[]{new WheelElement("Переднее правое."),
//                new WheelElement("Переднее левое."), new WheelElement("Заднее правое.")
//                , new WheelElement("Заднее левое."), new BodyElement(), new EngineElement()};
//    }
//
//    @Override
//    public void accept(Visitor visitor) {
//        for (Element elem : elements) {
//            elem.accept(visitor);
//        }
//        visitor.visit(this);
//    }
//}
//class BodyElement implements Element{
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}
//class HooliganVisitor implements Visitor{
//
//    @Override
//    public void visit(EngineElement engine) {
//        System.out.println("Завёл двигатель.");
//    }
//
//    @Override
//    public void visit(BodyElement body) {
//        System.out.println("Постучал по кузову.");
//    }
//
//    @Override
//    public void visit(CarElement car) {
//        System.out.println("Покурил внутри машины.");
//    }
//
//    @Override
//    public void visit(WheelElement wheel) {
//        System.out.println("Пнул " + wheel.getName() + " колесо.");
//    }
//}
//class MehanikVisitor implements Visitor{
//
//    @Override
//    public void visit(EngineElement engine) {
//        System.out.println("Проверил двигатель.");
//    }
//
//    @Override
//    public void visit(BodyElement body) {
//        System.out.println("Отполировал кузов.");
//    }
//
//    @Override
//    public void visit(CarElement car) {
//        System.out.println("Помыл машину.");
//    }
//
//    @Override
//    public void visit(WheelElement wheel) {
//        System.out.println("Подкачал " + wheel.getName() + " колесо.");
//    }
//}
