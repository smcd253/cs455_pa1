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

public class CoinTossSimulator {



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
    int numTrials = 0;
   public void run(int numTrials) {
    //    Scanner in = new Scanner(System.in);

    //    System.out.print("Enter number of trials: ");
    //    numTrials = in.nextInt();
    //    this.numTrials = numTrials;

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
       return 0; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return 0; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return 0; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {

   }

   public boolean tossesAdd()
   {
       if(this.getTwoHeads() + this.getTwoTails() + this.getHeadTails() == this.getNumTrials())
       {
           return true;
       }
       else return false;
   }

}
