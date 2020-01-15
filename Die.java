
/**
 * Write a description of class Die here.
 * 
 * @author Yumi Balthazar
 * @version 2020-01-15
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int result;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        result = roll();
    }

    /**
     * Rolls the die and returns the result
     */
    public int roll()
    {
        // put your code here
        result = (int) (Math.random() * 6 + 1);
        return result;
    }

    /**
     * Gets the result of the die
     */
    public int getResult()
    {
        return result;
    }
}
