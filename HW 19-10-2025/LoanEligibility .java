import java.util.Scanner;
 class LoanEligibility
 {
	 public static void main(String[] args)
	 {
		 Scanner Virat = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Virat.nextInt();
		
		 System.out.print("Enter your monthly income (₹): ");
        double income = Virat.nextDouble();
		
		if (age > 21 && income >= 25000) 
			
		{
            System.out.println("Eligible for Loan");
        } 
		else 
		
		{
            System.out.println("Not Eligible for Loan");
        }
		

		 
	 }
 } 
 