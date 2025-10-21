import java.util.Scanner;
class AlphabetCharacter
{
	public static void main(String[] args)
	{
		Scanner virat=new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = virat.next().charAt(0);
		
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+" "+"is an Alphabet");
		}
		else if(ch>='A'&&ch<='Z')
		{
			System.out.println(ch+" "+"is an Alphabet");
		}
		else
		{
			System.out.println(ch+" "+"is not an Alphabet");
		}
	}
}