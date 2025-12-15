
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


import java.util.Scanner;

public class VowelCount 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Output : " + count);
    }
}



 class ConcatString 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the FirstName:");
        String firstName = sc.nextLine();

        System.out.println("Enter the SecondName:");
        String secondName = sc.nextLine();

        String result = firstName + " " + secondName;

        System.out.println("Output:");
        System.out.println(result);
    }
}

 class PalindromeString 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reverse = reverse + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse)) 
        {
            System.out.println("It is a palindrome");
        } else
        {
            System.out.println("It is not a palindrome");
        }
    }
}

