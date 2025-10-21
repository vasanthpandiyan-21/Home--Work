import java.util.Scanner;
class GradeEvalution
{

public static void main(String[] args)
	{
		Scanner Virat = new Scanner(System.in);
		System.out.println("Select the Grade");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("F");
		char ch=Virat.next().charAt(0);
		
		switch(ch)
		{
			case 'A':
			System.out.println("Excellent");
			break;
			
			case 'B':
			System.out.println("Very good");
			break;
			
			case 'C':
			System.out.println("Good");
			break;
			
			case 'D':
		    System.out.println("Average");
			break;
			
			case 'F':
			System.out.println("Low");
			break;

			
			default:
			System.out.println("Invalid grade");
		}
	}
}