/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;

/**
 *
 * @author Hp
 */
public class Vehicle1 
{
 String type;
 int  speed;
 Vehicle1(String t, int s)
 {
     type =t;
     speed =s;
     
 }
 void showInfo(){
         System.out.println("type"+type+"speed"+speed);
 }
}

