import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;


public class Draw extends JPanel {
    private static final long serialVersionUID = 1L;
    private List<Figure> figureList;

    public void setFigures(List<Figure> fig) {
        figureList = fig;
    }

    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        int x = 25;
        int y = 25;
        for(int i = 0; i < figureList.size(); i++) {


            if(figureList.get(i).getFigure().equals("circle")) {
                g.setColor(figureList.get(i).getColo());
                g.fillOval(x, y, (int)figureList.get(i).getRadius(), (int)figureList.get(i).getRadius());
            }


            if(figureList.get(i).getFigure().equals("square")) {
                g.setColor(figureList.get(i).getColo());
                g.fillRect(x, y, (int)figureList.get(i).getEdge(), (int)figureList.get(i).getEdge());
            }


            if(figureList.get(i).getFigure().equals("trapezium")) {
                g.setColor(figureList.get(i).getColo());
                g.fillPolygon(new int[] {x, (int) (x + figureList.get(i).getLeft_edge()*Math.sin(figureList.get(i).getAngle())) ,
                        (int) (x + figureList.get(i).getLeft_edge()*Math.sin(figureList.get(i).getAngle()) + figureList.get(i).getUpper_edge()),
                        x + (int) figureList.get(i).getBottom_edge()},
                        new int[] {y + (int) (figureList.get(i).getLeft_edge()*Math.sin(figureList.get(i).getAngle())),
                                y, y, y + (int) (figureList.get(i).getLeft_edge()*Math.sin(figureList.get(i).getAngle()))}, 4);
            }


            if(figureList.get(i).getFigure().equals("triangle")) {
                g.setColor(figureList.get(i).getColo());
                g.fillPolygon(new int[]{x,x,(int) (x + figureList.get(i).getEdge_b())}, new int[]{y,(int)(y+figureList.get(i).getEdge_c()),y},3);
            }
            x += 100;
            if(i>0 && i%10 == 0) {
                y += 100;
                x = 25;
            }

        }
    }
}

