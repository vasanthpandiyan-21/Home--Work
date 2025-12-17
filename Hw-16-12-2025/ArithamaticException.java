/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class ArithamaticException
{
    public static void main(String[] args) 
    {
        Scanner vs =new Scanner(System.in);
        System.out.println("enter the first number :");
       try { 
        int num1 = vs.nextInt();
        System.out.println("enter the second number :");
        int num2 = vs.nextInt();
        int num3=num1/num2;
        System.out.println("Given  value is :" +num3);
        }
       catch( ArithmeticException e)
       {
           System.out.println("sir 0 is not divied enter correct number");
          
       }
       finally
       {System.out.println(" thank you");}
               
           
          
           
    }
}
