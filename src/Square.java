import java.awt.Color;

public class Square implements Figure{
    private float edge;
    private Color color;

    public Square(float edge, Color color) {
        this.edge = edge;
        this.color = color;
    }

    @Override
    public float getEdge() {
        return edge;
    }

    @Override
    public float area(){
        return edge*edge;
    }

    @Override
    public String getColor() {
        String str = "#"+Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
        return str;
    }

    @Override
    public Color getColo(){
        return color;
    }

    @Override
    public float getRadius() {
        return 0;
    }

    @Override
    public float getHypotenuse() {
        return 0;
    }

    @Override
    public void display(){
        System.out.println("Фигура: квадрат, площадь: "+area()+"кв.ед., длинна стороны: "+getEdge()+"ед., цвет: "+getColo()+"\n");
    }

    @Override
    public float getUpper_edge() {
        return 0;
    }

    @Override
    public float getBottom_edge() {
        return 0;
    }

    @Override
    public float getLeft_edge() {
        return 0;
    }

    @Override
    public float getRight_edge() {
        return 0;
    }

    @Override
    public float getAngle() {
        return 0;
    }

    @Override
    public float getEdge_c() {
        return 0;
    }

    @Override
    public float getEdge_a() {
        return 0;
    }

    @Override
    public float getEdge_b() {
        return 0;
    }

    @Override
    public String getFigure() {
        return "square";
    }
}
