/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfinal;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public  class MathHelper 
{

    // static method
    static int square(int n)
    {
        return n * n;
    }


    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = MathHelper.square(num);

        System.out.println("Square of " + num + " is: " + result);

    }
}

