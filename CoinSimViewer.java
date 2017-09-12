import javax.swing.JFrame;

public class CoinSimViewer
{
   public static void main(String[] args)
   {
        JFrame frame = new JFrame();

        int FRAME_WIDTH = 300;
        int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Coin Toss Sim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CoinSimComponent component = new CoinSimComponent();
        //component.paintComponent(Graphics g);
        frame.add(component);

        frame.setVisible(true);
   }
}