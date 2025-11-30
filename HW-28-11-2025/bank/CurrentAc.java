/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Hp
 */
public class CurrentAc  extends Bank
{

    public CurrentAc(double balance)
    {
        super(balance);
    }
    void calculatInterst(){
            double intrest=balance*0.05;
        System.out.println("current intrest rate :"+intrest);
    }
}
