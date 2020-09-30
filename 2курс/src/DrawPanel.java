import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {



    Back back = new Back(new Color(52, 58, 191),
            new Color(184, 21, 185), new Color(204, 162, 102), 0, 0, 1920, 1080);

    Sun sun = new Sun(200, 150, 350, 450,200, Color.ORANGE);
    Road road = new Road(0, 800, 1920, 600);

    private int k;
    Tree tree = new Tree(112 + k, 775, 20, 25);



    @Override
    public void paint(Graphics g) {

        Graphics2D gr = (Graphics2D) g;
            back.draw(gr);
            sun.draw(gr);
            road.draw(gr);
          tree.draw(gr);
    }
}