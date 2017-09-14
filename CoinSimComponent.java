import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D.Double;

public class CoinSimComponent extends JComponent
{
    // general bar formatting member vars
    private Color color;
    private int bottom; // neg moves up, pos moves down
    private int vertBuffer = 40;
    private int barWidth = 30;
    private int barBuf = 40; // neg moves left, pos moves right
    private double scale;

    // data formatting member vars
    private int numTwoHeads;
    private int numHeadsTails;
    private int numTwoTails;
    private int numTrials;
    
    private String headsLabel;
    private String tailsLabel;
    private String headsTailsLabel;
    
    private int heightOfLabels;
    private int widthOfHeadsLabel;

    private int widthOfTailsLabel;
    private int widthOfHeadsTailsLabel;

    private int totalHeight;
    private int applicationUnits;

    private int headsBarHeight;
    private int headsTailsBarHeight;
    private int tailsBarHeight;

    private double headsPctRaw;
    private double tailsPctRaw;
    private double headsTailsPctRaw;
    private int headsPct;
    private int tailsPct;
    private int headsTailsPct;
    

    
    // constructor to port over simulation data
    public CoinSimComponent(int numTrials, int numTwoHeads, int numTwoTails, int numHeadsTails)
    {
        this.numTrials = numTrials;
        this.numTwoHeads = numTwoHeads;
        this.numHeadsTails = numHeadsTails;
        this.numTwoTails = numTwoTails;

        this.headsPctRaw = (double)numTwoHeads/(double)numTrials;
        this.tailsPctRaw = (double)numTwoTails/(double)numTrials;
        this.headsTailsPctRaw = (double)numHeadsTails/(double)numTrials;
        
        this.headsPct = (int)(this.headsPctRaw * 100);
        this.tailsPct = (int)(this.tailsPctRaw * 100);
        this.headsTailsPct = (int)(this.headsTailsPctRaw * 100);
    
        // labels stuff
        this.headsLabel = "Two Heads: " + this.numTwoHeads + " (" + this.headsPct + "%)";
        this.tailsLabel = "Two Tails: " + this.numTwoTails + " (" + this.tailsPct + "%)";
        this.headsTailsLabel = "A Head and a Tail: " + this.numHeadsTails + " (" + this.headsTailsPct + "%)";

        // this.headsBarHeight = (int)(this.headsPctRaw * ((double)this.getHeight() - (double)this.vertBuffer));
        // this.headsTailsBarHeight = (int)(this.headsTailsPctRaw * ((double)this.getHeight() - (double)this.vertBuffer));
        // this.tailsBarHeight = (int)(this.tailsPctRaw * ((double)this.getHeight() - (double)this.vertBuffer));
    }
    public void paintComponent(Graphics g)
    {
        this.barBuf = (this.getWidth() - 3 * barWidth)/4;
        
        Graphics2D g2 = (Graphics2D) g;
        
        // labels
        Font font = g2.getFont();
        FontRenderContext context = g2.getFontRenderContext();
        
        Rectangle2D headsLabelBounds = font.getStringBounds(this.headsLabel, context);
        this.widthOfHeadsLabel = (int)headsLabelBounds.getWidth();
        this.heightOfLabels = (int)headsLabelBounds.getHeight();

        Rectangle2D tailsLabelBounds = font.getStringBounds(this.tailsLabel, context);
        this.widthOfTailsLabel = (int)tailsLabelBounds.getWidth();

        Rectangle2D headsTailsLabelBounds = font.getStringBounds(this.headsTailsLabel, context);
        this.widthOfHeadsTailsLabel = (int)headsTailsLabelBounds.getWidth();

        this.bottom = this.getHeight() - this.vertBuffer - this.heightOfLabels;
        //scale calculation
            //need total height for complete bar
        this.totalHeight = getHeight() - 2 * this.vertBuffer - this.heightOfLabels;
        this.scale = (double)this.totalHeight/(double)this.numTrials;
        // bars
        // definition ... Bar(int bottom, int left, int width, int barHeight, double scale, Color color, String label)

        Bar headsBar = new Bar(this.bottom, this.barBuf, 
                                this.barWidth, this.numTwoHeads, 
                                this.scale, color.RED, this.headsLabel); 
        headsBar.draw(g2);
        
        Bar headsTailsBar = new Bar(this.bottom, this.barWidth +  2 * this.barBuf, 
                                    this.barWidth, this.numHeadsTails, 
                                    this.scale, color.GREEN, this.headsTailsLabel); 
        headsTailsBar.draw(g2);

        Bar tailsBar = new Bar(this.bottom, 2 * this.barWidth + 3 * this.barBuf, 
                                    this.barWidth, this.numTwoTails, 
                                    this.scale, color.BLUE, this.tailsLabel); 
        tailsBar.draw(g2); 

        //Bar testBar = new Bar(450, 10, 40, 5, )
    }
}