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
public class Circlle  
{
    final double PI = 3.1;   

    void calculateArea(double radius)
    {
        double area = PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }



    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Circlle c = new Circlle();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.calculateArea(r);


     
    }
}
}
