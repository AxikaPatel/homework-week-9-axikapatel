package homework_9_arraylist;

import java.util.HashMap;
import java.util.Map;

/**
 *  Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_HasMap
{
    //create object for hashMap
    HashMap<String , Integer> people = new HashMap();

    //method for adding people
    public HashMap<String, Integer> getPeople()
    {
        people.put("Axika" , 30);
        people.put("Kruti", 35);
        people.put("Mansi" , 32);
        people.put("Manju",31);
        people.put("Paulomi", 34);
        people.put("Bhavi", 36);
        people.put("Rashang",38);
        people.put("Hitesh",39);
        return people;
    }


    public void setPeople()
    {
        System.out.println("Name\t\t\t\t   Age\t\t\t");
        System.out.println("----------------------");

        //for loop
        for (Map.Entry<String,Integer> people : people.entrySet())
        {
            System.out.println(people.getKey()+"\t\t\t"+people.getValue());
        }
    }

    public static void main(String[] args)
    {
        //object calling
        Programme_9_HasMap programme9HasMap = new Programme_9_HasMap();
        programme9HasMap.getPeople();
        programme9HasMap.setPeople();
    }
}
