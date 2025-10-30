class Armstrangloop
{
	public static void main(String[]args)
	
	{
		int a = 371;
		int temp = a;
		int rem = 0;
		int sum = 0;
		
		while (a>0){
			rem = a%10;
		    sum = sum +(rem*rem*rem);
			a= a/10;
			System.out.println("hi");
					
				
			
	}
				if(sum==temp)
				{System.out.println("its a armstrong number");
				}
				else 
				{
					System.out.println("its a not a armstrong number");
				
				}
}
}