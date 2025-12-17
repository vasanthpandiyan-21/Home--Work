/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.FileReader;

/**
 *
 * @author hi
 */
public class FinallyBlock 
{

    public static void main(String[] args)
    
        
      try
      {  FileReader vs = FileReader("sample .text")
                {
                    System.out.println("file open agiduchu");
                }
      }

    private static FileReader FileReader(String sample_text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      catch (Exception e)
      {
          System.out.println("not found");
      }
      
    }
 
}
