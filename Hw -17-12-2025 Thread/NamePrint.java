/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hi
 */


   public class NamePrint extends Thread 
   {

    String name;

    NamePrint(String name) 
    {
        this.name = name;
    }

    @Override
    public void run() 
    {
        try {
            System.out.println(name);
            Thread.sleep(2000); 
        } catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }


    public static void main(String[] args) 
    {

        NamePrint v1 = new NamePrint("DIWAKAR");
        NamePrint v2 = new NamePrint("KARTHIK");
        NamePrint v3 = new NamePrint("RAJESH");
        NamePrint v4 = new NamePrint("SATHISH");
        NamePrint v5 = new NamePrint("SURYA");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
    }
}





