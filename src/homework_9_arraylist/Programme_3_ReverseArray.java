package homework_9_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseArray
{
    //arraylist object
    ArrayList<Integer> list = new ArrayList();

    //method for adding value
    public void integerValue()
    {
        list.add(1789);
        list.add(2035);
        list.add(1899);
        list.add(1456);
        list.add(2013);
        list.add(1458);
        list.add(2458);
        list.add(1254);

        System.out.println("Original array: " + list);

        System.out.println("================================================");
        Collections.reverse(list);
        System.out.println("After Reverse " + list);
    }

    public static void main(String[] args)
        {
            //calling object
            Programme_3_ReverseArray programme3ReverseArray = new Programme_3_ReverseArray();
            programme3ReverseArray.integerValue();
        }


}
