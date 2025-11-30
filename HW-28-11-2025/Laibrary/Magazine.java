/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laibrary;

/**
 *
 * @author Hp
 */
public class Magazine  extends Lib
{
int issunum;
    public Magazine(int i , String t, String n) 
    {
        super(t, n);
        issunum=i;
    }

    Magazine(String tec_monthly_, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void showDispaly()
    {System.out.println("magazine title :"+title);
        System.out.println("issuses number ;"+issunum);

    
    }
}
