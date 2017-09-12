// Name: Spencer McDonough
// USC NetID: 6341617166
// CS 455 PA1
// Fall 2017

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.Array;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
   
    // member variables
    private int bottom;
    private int left;
    private int width;
    private int barHeight;
    private double scale;
    private Color color;
    private String label;
    private Double[] data;
    private int writeSpot;
    private int SIZE = 4096;

   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
    public Bar(int bottom, int left, int width, int barHeight,
                double scale, Color color, String label) {
           this.bottom = bottom;
           this.left = left;
           this.width = width;
           this.barHeight = barHeight;
           this.scale = scale;
           this.color = color;
           this.label = label;             
           this.data = new Double[SIZE];
           this.writeSpot = 0;         
    }
   
   //add value to bar data set
   public void addToBarData(double in)
   {
       Array.set(this.data,this.writeSpot, in);
       this.writeSpot++;
   }
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
    public void draw(Graphics2D g2) {
        int i = 0;
        double max = 0;

        for (Double findMax : this.data)
            if(max < findMax)
                max = findMax;

        int xwidth = this.width - 1;
        int yheight = this.barHeight - 1;

        int xleft = 0;
        int dataSize = Array.getLength(data);

        for (i = 0; i < dataSize; i++)
        {
            int xright = xwidth * (i + 1) / dataSize;
            int barWidth = xwidth / dataSize;
            int barHeight = (int) Math.round(yheight * data[i] / max);

            Rectangle bar = new Rectangle(xleft, yheight - barHeight, barWidth, barHeight);
            g2.draw(bar);

            xleft = xright;
        } 

    }
}
