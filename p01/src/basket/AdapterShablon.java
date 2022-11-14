package basket;

public class AdapterShablon {
    public static void main(String[] args) {
//        1)реализация через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRuster();
        g1.drawLine();
        g1.drawSquare();
//        1) через композицию:
        VectorGraphicsInterface g2 = new VectorAdapterFromRuster2(new RusterGraphics());//= new VectorAdapterFromRuster2();
        g2.drawLine();
        g2.drawSquare();

    }

}
interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}
class RusterGraphics{
    void drawRusterLine(){
        System.out.println("Рисую линию.");
    }
        void drawRusterSquare(){
            System.out.println("Рисую квадрат.");
    }

}
class VectorAdapterFromRuster extends RusterGraphics implements VectorGraphicsInterface {
    public void drawLine() {
        drawRusterLine();
    }

    public void drawSquare() {
        drawRusterSquare();
    }
}
class VectorAdapterFromRuster2  implements VectorGraphicsInterface{
    public VectorAdapterFromRuster2(RusterGraphics ruster) {
        this.ruster = ruster;
    }

    RusterGraphics ruster = null;//new RusterGraphics();

    @Override
    public void drawLine() {
        ruster.drawRusterLine();

    }

    @Override
    public void drawSquare() {
        ruster.drawRusterSquare();

    }
}
