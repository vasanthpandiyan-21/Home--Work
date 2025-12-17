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
public class ArrayoutBounds 
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,};
        Scanner vs =new Scanner(System.in);
        System.out.println("Enter the index value(0to 4):");
        
        
    try{ 
         int index= vs.nextInt();
        System.out.println(" value at the index is " +index +ar[index] );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array invalide");
        }
    }
}
