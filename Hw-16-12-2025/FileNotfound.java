/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author hi
 */
public class FileNotfound

{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
       try
       {
            FileReader vs = new FileReader("text.txt");
            System.out.println(" file is imported");
        
       }
        catch (FileNotFoundException  v)
        {
            System.out.println("file not supported ");
        }
    }
    
    
}
