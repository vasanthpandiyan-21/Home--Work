/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author Hp
 */
public class CreditCard  implements Payment
{
 

    @Override
    public void payment(double amount) 
    {
        System.out.println("paid amount"+amount+"using credit card");
    }
        
}
