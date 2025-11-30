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
public class Book extends Lib
{

    public Book(String t, String n) 
    {
        super(t, n);
        
    }
    void ShowDetails()
    {System.out.println("book title :"+title);
        System.out.println("Author name :"+name);

    }
}
