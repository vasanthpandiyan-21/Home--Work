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
public class SavingAc extends Bank
{
    

    public SavingAc(double balance) 
    {
        super(balance);
    }
    {
    }
    void caluctateIntrest()
    {
        double interst=balance*0.02;
        System.out.println("savaing accont rate of interset:"+interst);
    }

}
