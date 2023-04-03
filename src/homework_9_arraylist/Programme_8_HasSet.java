package homework_9_arraylist;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HasSet
{
    //create a Hasset object called number
    HashSet <Integer> number = new HashSet();

    //create instance Method and add number
    public HashSet<Integer> getNumber()
    {
        number.add(4);
        number.add(7);
        number.add(8);
        return number;
    }

    //Create Instance method
    public void setNumber()
    {
        //using for loop
        for (int i=1; i <= 10; i ++ )
        {
            if (number.contains(i))//if condition
            {
                System.out.println(i + " is find in the set number.");
            }
            else
            {
                System.out.println(i + " is find not in the set number.");
            }
        }
    }

    public static void main(String[] args)
    {
        //object calling
        Programme_8_HasSet programme8HasSet = new Programme_8_HasSet();
        programme8HasSet.getNumber();
        programme8HasSet.setNumber();

    }
}
