package homework_9_arraylist;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme_6_RetrieveElement
{
    //create arraylist object
    ArrayList list = new ArrayList();

    //instance method calling for adding list
    public void listElement()
    {
        list.add(10);
        list.add("Axika");
        list.add("India");
        list.add(30);
        list.add("London");
        System.out.println(list);
    }

    //instance method calling for retrieve element
    public void retrieve()
    {
        System.out.println("The element of index 1 is :" + list.get(1));

        System.out.println("The element of index 3 is :" + list.get(3));
    }

    public static void main(String[] args)
    {
        //object creation
        Programme_6_RetrieveElement programme6RetrieveElement = new Programme_6_RetrieveElement();
        programme6RetrieveElement.listElement();
        programme6RetrieveElement.retrieve();
    }
}
