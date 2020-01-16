
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
        System.out.print("Would you like instructions on how to play Craps (Y/n)?");
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
    
    public static int rollTheDice(Scanner in, Die d)
    {
        System.out.print("Press <Enter> to roll...");
        in.nextLine();       // Don't even need to save their input
        int result1 = d.roll();
        int result2 = d.roll();
        int total = result1 + result2;
        System.out.println("You rolled a " + result1 + " and a " + result2 + " for a total of " + total);
        return total;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Die d = new Die();
        System.out.println("The Game of Craps!");
        giveInstructions(in);
        System.out.println("Let's play craps!");
        
        String playStatus = "y";
        while(playStatus.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("First roll!");
            int result = rollTheDice(in,d);
            if (result == 7 || result == 11)
            {
                System.out.println("You win");
            }
            else if ( result == 2 || result == 3 || result == 12)
            {
                System.out.println("You lose");
            }
            else
            {
                int point = result;
                System.out.println("Your point is " + point + ". Roll again to try and get that value!");
                result = rollTheDice(in,d);
                while (result != 7 && result != point)
                {
                    System.out.println("Roll again!");
                    result = rollTheDice(in,d);
                    
                }
                if (result == 7)
                {
                    System.out.println("So sorry! You lose!");
                }
                else
                {
                    System.out.println("You win!");
                }
            }
                        

            System.out.println("Would you like to play again? (Y/n)");
            playStatus = in.nextLine();
            if (playStatus.equals("")) { playStatus = "y";}

        }
        
        System.out.print("Thanks for playing the game!");
        
    }
}
