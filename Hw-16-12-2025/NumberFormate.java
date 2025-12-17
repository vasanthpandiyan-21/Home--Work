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
public class NumberFormate 
{
    public static void main(String[] args) 
    {
        Scanner vs = new Scanner(System.in);
        System.out.println("Enter the number :");
        String input =vs.nextLine();
        try{
        int number= Integer.parseInt(input);
        System.out.println("enter the number"  +number);
        }
        catch (Exception e)
        {
            System.out.println("input string is not eligble");
        }
    }
   
}
