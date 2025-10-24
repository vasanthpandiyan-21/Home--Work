import java.util.Scanner;
class AgeCategory1
{
	public static void main(String[] args)
	{
		Scanner vs = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = vs.nextInt();
		
		if (age<=13)
		{
			System.out.println("child");
			
		}	
		else if (age>=13&& age<=19)
		{
			System.out.println("teenager");
			
		}	
		else if (age>=20&& age<=59)
		{
			System.out.println("adult");
		}
			
		 else 
		{
			System.out.println("senior");
		}
			

	}
	
	
}