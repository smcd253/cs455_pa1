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
        System.out.print("Tosses add up correctly? ");
        System.out.println(sim.tossesAdd());
        System.out.println();

        // test 1
        sim.run(1);
        System.out.print("After Run(1):");
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

        // test 10
        sim.run(10);
        System.out.print("After Run(10):");
        System.out.println();
        System.out.print("Number of Trials [exp: 11]: ");
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

        // reset
        sim.reset();

        // test 0 (after reset)
        System.out.print("After Reset:");
        System.out.println();
        System.out.print("Number of Trials [exp: 0]: ");
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

        // test 17
        sim.run(17);
        System.out.print("After Run(17):");
        System.out.println();
        System.out.print("Number of Trials [exp: 17] ");
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

        // test 100
        sim.run(100);
        System.out.print("After Run(100):");
        System.out.println();
        System.out.print("Number of Trials [exp: 117]: ");
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

        // test bar graph
        

    }
}