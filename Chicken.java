
/**
 * Class Chicken extends the Animal class and speaks like a chicken. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014
 */
public class Chicken extends Animal
{

    /**
     * Default constructor for a Chicken that calls the constructor with one parameter 
     * 
     */
    public Chicken()
    {
        this("chicken");
    }

    /**
     * Constructor for a Chicken with one parameter
     * 
     * @param chickenType the type of the chicken 
     */
    public Chicken(String chickenType)
    {
        super("Gallus Gallus Domesticus", chickenType);
    }

    /**
     * Allows the chicken to speak 
     * @return the phrase the chicken says
     */
    public String speak()
    {
        return "bawk";
    }

}
