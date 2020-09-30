import java.awt.*;

public class Back implements Drawable {

  public int  x,  y, width,  height;
  public Color color2,color3;

  public Back(Color color, Color color2, Color color3, int x, int y, int width, int height){
      this.color2=color2;
      this.color3=color3;
      this.x=x;
      this.y=y;
      this.width=width;
      this.height=height;
  }
    @Override
    public void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color3, 0, height, color2);
        g.setPaint(gp2);
        g.fillRect(x, y, width, height);
    }
}
