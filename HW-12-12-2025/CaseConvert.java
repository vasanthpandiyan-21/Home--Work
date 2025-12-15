
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hi
 */
public class CaseConvert

{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input:");
        String input = sc.nextLine();

        System.out.println("Press 1 for Uppercase");
        System.out.println("Press 2 for Lowercase");

        int choice = sc.nextInt();

        if (choice == 1) 
        {
            System.out.println(input.toUpperCase());
        } 
        else if (choice == 2) 
        {
            System.out.println(input.toLowerCase());
        } 
        else 
        {
            System.out.println("Invalid choice");
        }
    }
}



    


    
}
