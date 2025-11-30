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
public class VehicalMain 
{
    public static void main(String[] args)
    {
        Bike b=new Bike("Ns",48);
         b.showInfo();
         Car c =new Car("shift",120);
          c.showInfo();
    } 
}
