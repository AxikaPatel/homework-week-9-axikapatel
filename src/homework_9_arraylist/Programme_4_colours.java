package homework_9_arraylist;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4_colours
{
    //arraylist object
    ArrayList<String> colour = new ArrayList();

    //method for adding colour
   public void colourList()
   {
       colour.add("Red");
       colour.add("Pink");
       colour.add("White");
       colour.add("Black");
       colour.add("Blue");
       colour.add("Green");



   }

   //Instance method for collection colour
   public void collectionColour()
   {

       for( String list : colour)
       {
           System.out.println(list);
       }


       //adding colours
       ArrayList <String> colours = new ArrayList();
       colours.add("Brown");
       colours.add("Orange");

   }

   public static void main(String[] args)
   {
       //object creation
       Programme_4_colours programme4Colours = new Programme_4_colours();
       programme4Colours.colourList();

       programme4Colours.collectionColour();

   }
}
