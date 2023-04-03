package homework_9_arraylist;

import java.util.ArrayList;

/**
 *  Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11_Compare
{
    //arraylist object
    ArrayList<String> c1= new ArrayList<String>();
    ArrayList<String> c2= new ArrayList<String>();

    //create method for getting name
    public ArrayList<String> getC1() {
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        return c1;
    }

    //create method for getting name
    public ArrayList<String> getC2() {

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        //c2.add("White");
        c2.add("Pink");
        c2.add("Orange");
        return c2;
    }

    //create method with return no parameter
    public boolean compare()
    {
        //if condition
        if(getC1().containsAll(getC2()))
        {
            System.out.println("Two Arraylist is match");
            return true;
        }
        System.out.println("Two Arraylist is not match");
        return false;
    }


    public static void main(String[] args)
    {
        //object calling
        Programme_11_Compare programme11Compare = new Programme_11_Compare();
        programme11Compare.getC1();
        programme11Compare.getC2();
        programme11Compare.compare();
    }

}
