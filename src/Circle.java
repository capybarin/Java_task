import java.awt.Color;

public class Circle implements Figure {
    private float radius;
    private Color color;

    @Override
    public float getRadius() {
        return radius;
    }


    public Circle(float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public float area(){
        return (float)Math.PI*radius*radius;
    }

    @Override
    public String  getColor() {
        String str = "#"+Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
        return str;
    }

    @Override
    public Color getColo(){
        return color;
    }

    @Override
    public void display(){
        System.out.println("Фигура: круг, площадь: "+area()+"кв.ед., радиус: "+getRadius()+", цвет: "+getColo()+"\n");
    }

    @Override
    public float getHypotenuse() {
        return 0;
    }

    @Override
    public float getEdge() {
        return 0;
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
        return "circle";
    }
}
