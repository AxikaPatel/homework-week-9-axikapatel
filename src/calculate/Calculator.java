package calculate;

public class Calculator
{
    //instance method for addition no return with parameter
    public void addition(int a, int b)
    {
        int result =  a + b;
        System.out.println("Addition of" + a + " and " +b + " is :" + result  );

    }

    //instance method for subtraction no return with parameter
    public void subtraction(int a, int b)
    {
        int result = a - b;
        System.out.println( "Subtraction of" + a + " and " +b + " is :" + result );
    }

    //instance method for division no return with parameter
    public void division(int a, int b)
    {
        int result =  a / b;
        System.out.println("Division of" + a + " and " +b + " is :" + result );
    }

    //instance method for multiplication no return with parameter
    public void multiplication(int a,int b)
    {
        int result = a * b;
        System.out.println("Multiplication of" + a + " and " +b + " is :" + result );
    }

    //instance method for calculateresult no return with parameter
    public void calculateResult(int a,int b,char symbol)
    {
        if(symbol == '+')
        {
            addition(a,b);
        }
        else if(symbol == '-')
        {
            subtraction(a,b);
        }
        else if (symbol == '/')
        {
            division(a,b);
        }
        else if (symbol == '*')
        {
             multiplication(a,b);
        }
        else
        {
            System.out.println("Invalid Symbol");
        }


    }

}
