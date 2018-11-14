import java.util.ArrayList;
/**
 * Outputs the lyrics to Old MacDonald Had a Farm. 
 * 
 * @author Karina Patel 
 * @version November 7, 2014 
 */
public class OldMacDonaldsFarm
{
    private String farmerName;
    private ArrayList<Animal> farmAnimals;

    /**
     * Constructor for the OldMacDonaldsFarm tester  
     */
    public OldMacDonaldsFarm( ) 
    { 
        farmerName = "Old MacDonald"; 
        farmAnimals = new ArrayList<Animal>();
    }

    /**
     * Tests the OldMacDonaldsFarm logic.
     * 
     * @param args information past via the command line
     */
    public static void main (String [ ] args) 
    {
        OldMacDonaldsFarm singer = new OldMacDonaldsFarm( ); 
        singer.farmAnimals.add(new Chicken( ));
        singer.singVerse( );
        singer.farmAnimals.add(new Chick());
        singer.singVerse( ); 
        singer.farmAnimals.add(new Rooster( )); 
        singer.singVerse( ); 
        singer.farmAnimals.add(new Pig( )); 
        singer.singVerse( );
    }

    /**
     * Gives the lyrics to the Old Macdonald song. 
     * 
     */
    public void singVerse()
    {
        Animal lastElement = farmAnimals.get(farmAnimals.size() - 1);
        String animalType = lastElement.getCommonName();
        String phrase1 = farmerName + " had a farm, ";
        String ei = " E-I-E-I-O";
        String firstPhrase = phrase1 + ei + ".";
        String firstLine = phrase1 + ei + " and on his farm he had some ";

        System.out.println(firstLine + animalType + "s" + "," + ei + ".");
        for (int i = farmAnimals.size() - 1; i >= 0; i--)
        {
            Animal element = farmAnimals.get(i);
            String speak = element.speak();
            String speakspeak = speak + "-" + speak;
            System.out.println("With a " + speakspeak + " here, and a " + speakspeak + " there, ");
            System.out.println("Here a " + speak + "," + " there a " + speak + "," + 
                " every where a " + speakspeak + ",");
        }
        System.out.println(firstPhrase);
        System.out.println();

    }
}

