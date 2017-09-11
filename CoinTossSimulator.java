// Name: Spencer McDonough
// USC NetID: 6341617166
// CS 455 PA1
// Fall 2017

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

 import java.util.Scanner;
 import java.util.Random;

public class CoinTossSimulator {

    // member variables
    private int numTwoHeads = 0;
    private int numTwoTails = 0;
    private int numHeadsTails = 0;
    private int numTrials = 0;
    /**
        Creates a coin toss simulator with no trials done yet.
    */
    public CoinTossSimulator() {

    }


    /**
        Runs the simulation for numTrials more trials. Multiple calls to this method
        without a reset() between them *add* these trials to the current simulation.
        
        @param numTrials  number of trials to for simulation; must be >= 1
    */

    public void run(int numTrials) {
        // add internal numTrials variable to object numTrials (Total)
        this.numTrials += numTrials;

        // generate two random coin tosses per trial
        for (int i = 0; i < numTrials; i++)
        {
            Random randToss = new Random();

            int coinTossA = randToss.nextInt(2);
            int coinTossB = randToss.nextInt(2);
            
            if (coinTossA == 0 && coinTossB == 0)
                this.numTwoHeads++;
            else if (coinTossA == 1 && coinTossB == 1)
                this.numTwoTails++;
            else // two cases where either can be heads while the other is tails
                this.numHeadsTails++;
        } 

        // call bar stuff
    }


    /**
        Get number of trials performed since last reset.
    */
    public int getNumTrials() {
        return this.numTrials; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
        Get number of trials that came up two heads since last reset.
    */
    public int getTwoHeads() {
        return this.numTwoHeads; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
        Get number of trials that came up two tails since last reset.
    */  
    public int getTwoTails() {
        return this.numTwoTails; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
        Get number of trials that came up one head and one tail since last reset.
    */
    public int getHeadTails() {
        return this.numHeadsTails; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
        Resets the simulation, so that subsequent runs start from 0 trials done.
    */
    public void reset() {
        this.numTrials = 0;
        this.numTwoHeads = 0;
        this.numTwoTails = 0;
        this.numHeadsTails = 0;
    }

    public boolean tossesAdd()
    {
        // DEBUG
        // System.out.print("tossesAdd total trial count: ");
        // System.out.println(this.getTwoHeads() + this.getTwoTails() + this.getHeadTails());
                //

        if(this.getTwoHeads() + this.getTwoTails() + this.getHeadTails() == this.getNumTrials())
        {
            return true;
        }
        else return false;
    }
}
