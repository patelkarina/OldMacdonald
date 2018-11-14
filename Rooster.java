
/**
 * Class Rooster extends the Chicken class and speaks like a rooster. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014
 */
public class Rooster extends Chicken
{
    /**
     * Default constructor for a Rooster
     * 
     */
    public Rooster()
    {
        super("rooster");
    }
    
    /**
     * Allows the rooster to speak
     * 
     * @return the phrase the chicken says 
     */
    public String speak()
    {
        return "cock-a-doodle-do";
    }
}
