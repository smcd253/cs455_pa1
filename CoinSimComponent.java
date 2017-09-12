import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CoinSimComponent extends JComponent
{
    private Color color;
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      // definition ... Bar(int bottom, int left, int width, int barHeight, double scale, Color color, String label)
      Bar _bar = new Bar(0, 0, this.getWidth(), this.getHeight(), 1.0, color.RED, "Test");
      _bar.draw(g2);
   }

}