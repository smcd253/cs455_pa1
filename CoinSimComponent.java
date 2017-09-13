import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CoinSimComponent extends JComponent
{
    // general bar formatting member vars
    private Color color;
    private int bottomBuffer = 40; // neg moves up, pos moves down
    private int barBuf = 40; // neg moves left, pos moves right
    private int sideBufScale = 10;
    private double scale = 4.0;
    private int heightScale = 10;

    // data formatting member vars
    private int numTwoHeads;
    private int numHeadsTails;
    private int numTwoTails;
    private int headsBarHeight;
    private int headsTailsBarHeight;
    private int tailsBarHeight;
    
    // constructor to port over simulation data
    public CoinSimComponent(int numTrials, int numTwoHeads, int numTwoTails, int numHeadsTails)
    {
        this.numTwoHeads = numTwoHeads;
        this.numHeadsTails = numHeadsTails;
        this.numTwoTails = numTwoTails;

        this.headsBarHeight = (int)((double)numTwoHeads/(double)numTrials) * this.heightScale;
        this.headsTailsBarHeight = (numHeadsTails/numTrials) * this.heightScale;
        this.tailsBarHeight = (numTwoTails/numTrials) * this.heightScale;
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // definition ... Bar(int bottom, int left, int width, int barHeight, double scale, Color color, String label)
        Bar headsBar = new Bar(this.bottomBuffer, getWidth()/this.sideBufScale, 
                                this.getWidth()/(int)scale, this.getHeight() - this.headsBarHeight, 
                                scale, color.RED, "Two Heads: " + this.numTwoHeads); 
        headsBar.draw(g2);
        
        Bar headsTailsBar = new Bar(this.bottomBuffer, headsBar.getWidth() + getWidth()/this.sideBufScale + this.barBuf, 
                                    this.getWidth()/(int)scale, this.getHeight() - this.headsTailsBarHeight, 
                                    scale, color.GREEN, "A Head and a Tail: " + this.numHeadsTails); 
        headsTailsBar.draw(g2);

        Bar tailsBar = new Bar(this.bottomBuffer, headsBar.getWidth() + headsTailsBar.getWidth() + getWidth()/this.sideBufScale + 2 * this.barBuf, 
                                    this.getWidth()/(int)scale, this.getHeight() - this.tailsBarHeight, 
                                    scale, color.BLUE, "Two Tails: " + this.numTwoTails); 
        tailsBar.draw(g2);
    }
}