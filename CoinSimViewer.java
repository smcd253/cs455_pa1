import javax.swing.JFrame;

public class CoinSimViewer
{
   public static void main(String[] args)
   {

        // run simulation
        CoinTossSimulator sim = new CoinTossSimulator();
        sim.run(200);
        System.out.print("After Run(200):");
        System.out.println();
        System.out.print("Number of Trials [exp: 1] ");
        System.out.println(sim.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(sim.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(sim.getTwoTails());
        System.out.print("One-head one-tail tosses: ");
        System.out.println(sim.getHeadTails());        
        System.out.print("Tosses add up correctly? ");
        System.out.println(sim.tossesAdd());
        System.out.println();

        JFrame frame = new JFrame();

        int FRAME_WIDTH = 300;
        int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Coin Toss Sim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // public void CoinSimComponent(int numTrials, int numTwoHeads, int numTwoTails, int numHeadsTails)

        CoinSimComponent component = new CoinSimComponent(sim.getNumTrials(), sim.getTwoHeads(), 
                                                        sim.getTwoTails(), sim.getHeadTails());
        //component.paintComponent(Graphics g);
        frame.add(component);

        frame.setVisible(true);
   }
}