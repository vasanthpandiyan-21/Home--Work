/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author Hp
 */

    public class Circle extends Shape1 
{

    double radius;

    Circle(double radius) 
    {
        this.radius = radius;
    }

    void area()
    {
        double a = 3.14 * radius * radius;
        System.out.println("Area of circle: " + a);
    }
}

