//CoinTossSimulatorTester.java

public class CoinTossSimulatorTester
{
    public static void main(String[] args)
    {
        // empty constructor
        CoinTossSimulator sim = new CoinTossSimulator();

        // test 0
        System.out.print("After Constructor:");
        System.out.println();
        System.out.print("Number of Trials [exp: 0]: ");
        System.out.println(sim.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(sim.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(sim.getTwoTails());
        System.out.print("One-head one-tail tosses: ");
        System.out.println(sim.getHeadTails());        
        System.out.print("Tosses add up correctly?");
        System.out.println();                        
        
    }
}