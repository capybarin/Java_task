import java.awt.Color;

public class Triangle implements Figure {
    private float edge_a;
    private float edge_b;
    private float edge_c;
    private Color color;

    public Triangle(float edge_a, float edge_b, float edge_c, Color color) {
        this.edge_a = edge_a;
        this.edge_b = edge_b;
        this.edge_c = edge_c;
        this.color = color;
    }

    @Override
    public String  getColor() {
        String str = "#"+Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
        return str;
    }

    @Override
    public float getRadius() {
        return 0;
    }

    @Override
    public Color getColo(){
        return color;
    };

    //Проверка является ли заданный треугольник прямоугольным, ибо только такой треугольник содержит гипотенузу
    @Override
    public float getHypotenuse(){
        float hypoten;
        if ((edge_a*edge_a+edge_b*edge_b)==(edge_c*edge_c)){
            hypoten=(float)Math.sqrt(edge_a*edge_a+edge_b*edge_b);
        }
        else if((edge_a*edge_a+edge_c*edge_c)==(edge_b*edge_b)){
            hypoten=(float)Math.sqrt(edge_a*edge_a+edge_c*edge_c);
        }
        else if((edge_b*edge_c+edge_c*edge_c)==(edge_a*edge_a)){
            hypoten=(float)Math.sqrt(edge_b*edge_c+edge_c*edge_c);
        }else{hypoten=0;}
        return hypoten;
    }

    @Override
    public float getEdge() {
        return 0;
    }

    @Override
    public float area(){
        float p=(edge_a+edge_c+edge_b)/2;
        float S=(float)Math.sqrt(p*(p-edge_b)*(p-edge_c)*(p-edge_a));
        return S;
    }

    @Override
    public void display(){
        System.out.println("Фигура: треугольник, площадь: "+area()+"кв.ед., гипотенуза: "+getHypotenuse()+", цвет: "+getColo()+"\n");
    }

    @Override
    public float getEdge_a() {
        return edge_a;
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
        return edge_c;
    }

    @Override
    public float getEdge_b() {
        return edge_b;
    }

    @Override
    public String getFigure() {
        return "triangle";
    }
}
