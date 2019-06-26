import java.util.ArrayList;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> list_figure = new ArrayList<>();
        System.out.println("Введите кол-во элементов списка: ");
        Scanner scanner = new Scanner(System.in);
        Color color;
        float R,G,B;
        int elements =scanner.nextInt();
        for (int i = 0; i < elements; i++) {
            int figure_choice=(int)(Math.random()*4);
            switch (figure_choice) {
                case 0:
                    float rnd = (float)Math.random()*50;
                    R = (float)Math.random();
                    G = (float)Math.random();
                    B = (float)Math.random();
                    color = new Color(R, G, B);
                    Square tmp = new Square(rnd, color);
                    list_figure.add(tmp);
                    break;
                case 1:
                    float a,b,c;
                    //Проверка может ли такой треугольник существовать
                    do {
                        a = (float) Math.random() * 50;
                        b = (float) Math.random() * 50;
                        c = (float) Math.random() * 50;
                    }while(!(a+b>c)||!(a+c>b)||!(c+b>a));
                    R = (float) Math.random();
                    G = (float) Math.random();
                    B = (float) Math.random();
                    color = new Color(R, G, B);
                    Triangle tmp1 = new Triangle(a, b, c, color);
                    list_figure.add(tmp1);
                    break;
                case 2:
                    float radius = (float)Math.random()*50;
                    R = (float) Math.random();
                    G = (float) Math.random();
                    B = (float) Math.random();
                    color = new Color(R, G, B);
                    Circle tmp2 = new Circle(radius,color);
                    list_figure.add(tmp2);
                    break;
                case 3:
                    float upper = (float) Math.random() * 50;
                    float bottom = (float) Math.random() * 50;
                    float left = (float) Math.random() * 50;
                    float right = (float) Math.random() * 50;
                    float angle = (float) Math.toRadians(Math.random()*180);
                    R = (float) Math.random();
                    G = (float) Math.random();
                    B = (float) Math.random();
                    color = new Color(R, G, B);
                    trapezium tmp3 = new trapezium(upper,bottom,left,right,angle,color);
                    list_figure.add(tmp3);

            }
        }


        //Так как все данные получаются путем рандома, при этом еще и тип данных float, то сгенерировать прямоугольный треугольник почти невозможно
        //И для проверки правильности подсчета длинны гипотенузы был вручную добавлен Египетский треугольник. Но размер списка тогда N+1 элементов
        R = (float)Math.random();
        G = (float)Math.random();
        B = (float)Math.random();
        color = new Color(R, G, B);
        Triangle test = new Triangle(3,5,4,color);
        list_figure.add(test);

        for (Figure figure : list_figure) {
            figure.display();
        }

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw anDraw = new Draw();
        anDraw.setFigures(list_figure);
        anDraw.setBackground(Color.WHITE);
        frame.add(anDraw);
        frame.setSize(800, 800);
        frame.setVisible(true);

    }

}
