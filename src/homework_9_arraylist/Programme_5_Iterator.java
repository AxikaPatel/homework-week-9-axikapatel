package homework_9_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Programme_5_Iterator
{
    //Declaring the arraylist
    ArrayList<String> list = new ArrayList();

    //instance Method
    //Creating an ArrayList
    public void listElement()
    {
        list.add("Apple");
        list.add("Banana");
        list.add("Strawberry");
        list.add("Kiwi");
        list.add("Watermelon");
        list.add("Melon");
    }

    //instance Method
    public void iterator()
    {
        //declaring the Iterator
        Iterator<String> name = list.iterator();

        //while loop
        while (name.hasNext())
        {
            System.out.println(name.next());
        }
    }

    public static void main(String[] args)
    {
        //object creation 
        Programme_5_Iterator programme5Iterater = new Programme_5_Iterator();
        programme5Iterater.listElement();
        programme5Iterater.iterator();
    }
}