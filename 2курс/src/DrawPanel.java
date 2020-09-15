import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Color color1 = new Color(52, 58, 191);
        Color color2 = new Color(184, 21, 185);
        Color color3 = new Color(204, 162, 102);
        Color color4 = new Color(2, 208, 112);


        back(gr, color1, color3, color2, 0, 0, 1920, 800);

        sun(gr, 200, 300, color3, color2, 800, 300, 300);
        road(gr, 0, 800, 800, 250);
        trees(gr, 112, 775, 20, 25);

    }

    public void back(Graphics2D gr, Color color1, Color color2, Color color3, int x, int y, int width, int height) {
        gr.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color3, 0, height, color2);
        gr.setPaint(gp2);
        gr.fillRect(x, y, width, height);
    }


    public void sun(Graphics2D g, int x, int y, Color color1, Color color2, int height, int width2, int height2) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color1, 0, height, color2);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width2, height2);
        g.setPaint(gp2);

    }

    public void road(Graphics2D gr, int x, int y, int width, int height) {
        gr.setColor(Color.gray);
        gr.fillRect(x, y, width, height);


    }

    public void trees(Graphics2D gr, int x, int y, int width, int height) {
        for (int i = 0; i < 10; i++) {
            int n = 200;
            tree(gr, 112 + n, 775, 20, 25);
        }
    }

    public void tree(Graphics2D gr, int x, int y, int width, int height) {


        for (int i = 0; i < 10; i++) {
            for (int n =0 ; n < 1800; n += 200) {
                gr.setColor(Color.BLACK);
                gr.fillRect(112 + n, 775, 20, 25);
                gr.setColor(Color.green);

                gr.fillPolygon(new int[]{180 + n, 60 + n, 120 + n}, new int[]{780, 780, 720}, 3);
                gr.fillPolygon(new int[]{180 + n, 60 + n, 120 + n}, new int[]{760, 760, 700}, 3);
                gr.fillPolygon(new int[]{180 + n, 60 + n, 120 + n}, new int[]{740, 740, 660}, 3);


            }
        }
    }
}
