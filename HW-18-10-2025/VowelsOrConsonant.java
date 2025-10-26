import java.util.Scanner;
class VowelsOrConsonant
{
	public static void main(String[] args)
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = var.next().charAt(0);
		
		
		
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
            case 'I':
			case 'O':
			case 'U':	
			System.out.println("You are Entered a vowel Letter");
			break;
		
		default:
		
			{
				System.out.println("You are Entered a Constant Letter");
			}
		}
	}
}