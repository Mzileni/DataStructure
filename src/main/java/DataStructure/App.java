package DataStructure;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Collection Demo" );

        //ArrayList
        List a1 = new ArrayList();
        a1.add("Nizo");
        a1.add("Mzileni");
        System.out.println("List elements");
        System.out.print("\t" + a1);

        //hashSet
        Set s1 = new HashSet();
        s1.add("Inga");
        s1.add("Mzileni");
        System.out.println("Set elements");
        System.out.print("\t" + s1);

        //hashmap
        Map m1 = new HashMap();
        m1.put("Inga", 216279631);
        m1.put("Nizo", 217696311);
        System.out.println("Map elements");
        System.out.print("\t" + m1);





    }
}
