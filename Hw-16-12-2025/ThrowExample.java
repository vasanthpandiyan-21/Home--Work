
import java.util.Scanner;

public class ThrowExample 
{

    static void checkNumber(int num) 
    {
        if (num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        }
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            checkNumber(n);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
