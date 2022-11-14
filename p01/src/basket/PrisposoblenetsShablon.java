//package basket;
//
//import java.util.*;
//
//public class PrisposoblenetsShablon {
//    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
//        List<Shape>shapes = new ArrayList<>();
//
//        shapes.add(shapeFactory.getShape("квадрат"));
//        shapes.add(shapeFactory.getShape("круг"));
//        shapes.add(shapeFactory.getShape("точка"));
//        shapes.add(shapeFactory.getShape("круг"));
//        shapes.add(shapeFactory.getShape("круг"));
//        shapes.add(shapeFactory.getShape("квадрат"));
//
//        Random rand = new Random();
//        for (Shape shape : shapes ){
//            int x = rand.nextInt(100);
//            int y = rand.nextInt(100);
//            shape.drow(x,y);
//        }
//
//    }
//}
//interface Shape{
//    void drow(int x, int y);
//}
//class Point implements Shape{
//
//    @Override
//    public void drow(int x, int y) {
//        System.out.println("(" + x + "," + y + "): рисуем точку.");
//    }
//}
//class Circle implements Shape{
//    int r = 5;
//
//    @Override
//    public void drow(int x, int y) {
//        System.out.println("(" + x + "," + y + "): рисуем круг с радиусом " + r);
//    }
//}
//class Square implements Shape{
//    int a = 10;
//
//    @Override
//    public void drow(int x, int y) {
//        System.out.println("(" + x + "," + y + "): рисуем квадрат со стороной " + a);
//    }
//}
//class ShapeFactory{
//    private static final Map<String,Shape> shapes = new HashMap<>();
//    public Shape getShape(String shapeName){
//        Shape shape = shapes.get(shapeName);
//        if (shape == null){
//            switch (shapeName){
//                case "круг":
//                    shape = new Circle();
//                    break;
//                case "квадрат":
//                    shape = new Square();
//                    break;
//                case "точка":
//                    shape = new Point();
//                    break;
//
//            }
//            shapes.put(shapeName,shape);
//        }
//        return shape;
//    }
//}
