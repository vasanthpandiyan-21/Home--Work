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
public class Rectangle extends Shape1

 {
    double length, breadth;

    Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    void area() 
    {
        double a = length * breadth;
        System.out.println("Area of rectangle: " + a);
    }
}