import java.util.Scanner;
class Multiple
{ public static void main(String[] args)
	{
		Scanner vs = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = vs.nextInt();
		
		if (num %3 ==0&& num % 7==0)
		{
			System.out.println("Multiple of 3and 7");
		}
		
		
		 else if (num %3 ==0)
		{
			System.out.println("Multiple of 3");
		}
		
		 else if (num %7 ==0)
		{
			System.out.println("Multiple of 7");
		}
		
		else
		{
			System.out.println(" Not Multiple of 3and 7");
		}
	}
	
}