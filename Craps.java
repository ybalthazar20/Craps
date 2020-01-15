
/**
 * Write a description of class Craps here.
 * 
 * @author Yumi Balthazar 
 * @version 2020-01-15
 */

import java.util.Scanner;

public class Craps
{
    public static void giveInstructions(Scanner in)
    {
        System.out.print("Would you instructions on how to play Craps (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.equals("") || 
            playGame.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
            System.out.println("Good luck!");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("The Game of Craps!");
        giveInstructions(in);
        System.out.println("Let's play craps!");
        
        String playStatus = "y";
        while(playStatus.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("DEBUG: We're going to play Craps...");
                        
            System.out.print("Press <Enter> to roll...");
            String pause = in.nextLine();
            
            
            
            
            System.out.println("Would you like to play again? (Y/n)");
            playStatus = in.nextLine();
            if (playStatus.equals("")) { playStatus = "y";}
            
            
            
            
            
        }
        
    }
}
