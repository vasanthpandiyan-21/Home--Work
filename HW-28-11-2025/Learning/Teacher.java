/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning;

/**
 *
 * @author Hp
 */
public class Teacher extends User 
{

    public Teacher(String n) 
    {
        super(n);
    }
    void welcome()
    {
        System.out.println("welcome  Teacher:"+name);
    }
}

