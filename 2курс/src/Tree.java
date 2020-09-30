import java.awt.*;

public class Tree implements Drawable {
    private int x, y, width, height,k;

    public Tree(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;


    }

    @Override
    public void draw(Graphics2D g) {
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 1800; k += 200) {
                g.setColor(Color.BLACK);
                g.fillRect(112 + k, 775, 20, 25);
                g.setColor(Color.green);

                g.fillPolygon(new int[]{180 + k, 60 + k, 120 + k}, new int[]{780, 780, 720}, 3);
                g.fillPolygon(new int[]{180 + k, 60 + k, 120 + k}, new int[]{760, 760, 700}, 3);
                g.fillPolygon(new int[]{180 + k, 60 + k, 120 + k}, new int[]{740, 740, 660}, 3);

            }
        }
    }
}
