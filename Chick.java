
/**
 * Class chick extends the Chicken class and speaks like a chick. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014
 */
public class Chick extends Chicken 
{
    /**
     * Default constructor for Chick 
     * 
     */
    public Chick()
    {
        super("chick");
    }

    /**
     * Allows the chick to speak 
     * @return the phrase the chick says
     */
    public String speak()
    {
        return "peep";
    }
}
