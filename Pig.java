
/**
 * Class Pig extends the Animal class and speaks like a pig. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014 
 */
public class Pig extends Animal 
{
    /**
     * Default constructor for a pig 
     */
    public Pig()
    {
       super("sus", "pig");
    }

    /**
     * Allows the pig to speak 
     * 
     * @return the phrase the pig speaks 
     */
    public String speak()
    {
        return "oink";
    }
}
