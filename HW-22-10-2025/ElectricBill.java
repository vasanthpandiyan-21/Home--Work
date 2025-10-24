import java.util.Scanner;
class ElectricBill
{
		public static void main(String[] args)
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Enter bill unit");
		int unit = var.nextInt();
		
		
		if (unit<=100)
		{
		System.out.println(unit*5);
		}
		
		else if (unit<=101&&unit>200)
		{
			System.out.println(unit*7);
		}
		
		
		 else
			 System.out.println("unit 10*");
   }   
   
}
