package homework_9_arraylist;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */

public class Programme_7_EmptyOrNot
{
    //create arraylist object
    ArrayList <Integer> list =  new ArrayList<>();

    //instance method create for check array list is empty or not
    public void isEmptyArray()
    {
       boolean ans = list.isEmpty();
       //if condition
        if (ans == true)
        {
            System.out.println("The arraylist is empty");
        }
        else
        {
            System.out.println("The arraylist is not empty");
        }
    }

    //instance method create for check array list is empty or not
    public void isNotEmptyArray()
    {
        list.add(10);
        list.add(40);
        list.add(60);
        list.add(20);
        list.add(40);
        boolean ans = list.isEmpty();

        //if condition
        if (ans == true)
        {
            System.out.println("The arraylist is empty");
        }
        else
        {
            System.out.println("The arraylist is not empty");
        }
    }

    public static void main(String[] args)
    {
        //object calling
        Programme_7_EmptyOrNot programme7EmptyOrNot = new Programme_7_EmptyOrNot();

        programme7EmptyOrNot.isEmptyArray();
        programme7EmptyOrNot.isNotEmptyArray();
    }
}
