import java.awt.*;

public class Road implements Drawable {
    public int x, y, width, height;

    public Road(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


@Override
    public void draw(Graphics2D g) {
    g.setColor(Color.gray);
    g.fillRect(x, y, width, height);
    }
}
