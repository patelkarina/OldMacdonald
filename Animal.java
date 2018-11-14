
/**
 * Class Animal has properties of various animals such as their latin name, 
 * their common name, and their ability to speak or not. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014 
 */
public abstract class Animal implements Comparable
{
    private String latinName;
    private String commonName;

    /**
     * Constructor for abstract class Animal.
     * 
     * @param latin the latin name of the animal
     * @param common the common name of the animal 
     */
    public Animal(String latin, String common)
    {
        latinName = latin;
        commonName = common;
    }

    /**
     * Gets the latin name of the animal. 
     * 
     * @return the latin name of the animal 
     */
    public String getLatinName()
    {
        return latinName;
    }

    /**
     * Sets the latin name of the animal. 
     * @param lName the latin name of the animal 
     * 
     */
    public void setLatinName(String lName)
    {
        latinName = lName;
    }

    /**
     * Sets the common name of the animal. 
     * @param cName the common name of the animal 
     * 
     */
    public void setCommonName(String cName)
    {
        commonName = cName;
    }

    /**
     * Gets the common name of the animal 
     * 
     * @return the common name of the animal 
     */
    public String getCommonName()
    {
        return commonName;
    }

    /**
     * Allows the animal to speak 
     * @return the phrase that the animal says 
     */
    public abstract String speak();

    /**
     * Compares the name of one object to another 
     * @param obj the object being tested as an animal  
     * @return true if the object is an animal, otherwise 
     * @throw IllegalArgumentException if the object is not an animal 
     * 
     */
    public int compareTo(Object obj)
    {
        if (obj instanceof Animal)
        { 
            Animal annie = (Animal)obj;
            return this.getCommonName().compareTo (annie.getCommonName());
        }
        else
        {
            throw new IllegalArgumentException("Not an animal");
        }
    }
}
