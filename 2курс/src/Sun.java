import java.awt.*;

public class Sun implements Drawable {
    public int x, y, r, R, n;
    public Color color;

    public Sun(int x, int y, int r,int R,int n, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.n = n;
        this.color = Color.ORANGE;
    }


    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        double an = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(an * i);
            double dy1 = r * Math.sin(an * i);
            double dx2 = R * Math.cos(an * i);
            double dy2 = R * Math.sin(an * i);
            g.drawLine((int) dx1 + x, (int) dy1 + y, (int) dx2 + x, (int) dy2 + y);
        }
    }
}

