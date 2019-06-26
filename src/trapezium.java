import java.awt.Color;

public class trapezium implements Figure{
    private float upper_edge, bottom_edge, left_edge, right_edge,angle;
    private Color color;

    @Override
    public float getUpper_edge() {
        return upper_edge;
    }

    @Override
    public float getBottom_edge() {
        return bottom_edge;
    }

    @Override
    public float getLeft_edge() {
        return left_edge;
    }

    @Override
    public float getRight_edge() {
        return right_edge;
    }

    @Override
    public float getAngle() {
        return angle;
    }

    public trapezium(float upper_edge, float bottom_edge, float left_edge, float right_edge, float angle, Color color) {
        this.upper_edge = upper_edge;
        this.bottom_edge = bottom_edge;
        this.left_edge = left_edge;
        this.right_edge = right_edge;
        this.angle = angle;
        this.color = color;
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
    public String  getColor() {
        String str = "#"+Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
        return str;
    }

    @Override
    public Color getColo(){
        return color;
    }

    @Override
    public float area(){
        float S=(upper_edge+bottom_edge)/2 + (float)(Math.sqrt(left_edge*left_edge - ((bottom_edge-upper_edge)*(bottom_edge-upper_edge) +
                left_edge*left_edge - right_edge*right_edge)/(2*(bottom_edge-upper_edge))));
        return S;
    }

    @Override
    public String getFigure() {
        return "trapezium";
    }

    @Override
    public  void display(){
        System.out.println("Фигура: трапеция, площадь: "+area()+"кв.ед., верхняя грань: "+upper_edge+"ед., нижняя грань: "+bottom_edge
                +"ед., левая грань: "+left_edge+"ед., правая грань: "+right_edge+"ед., цвет: "+getColo()+"\n");
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
    public float getEdge() {
        return 0;
    }
}

