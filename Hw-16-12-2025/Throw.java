/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author hi
 */
public class Throw
{

    
    static void checkNumber(int num) throws Exception
    {

        if (num < 0) 
        {
            throw new Exception("Negative number not allowed");
        }
        else
        {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args)
    {

        try 
        {
            checkNumber(-1);  
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

