import java.util.Scanner;
class TrafficLight
{

public static void main(String[] args)
	{
		Scanner Virat = new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("Red");
		System.out.println("Green");
		System.out.println("yellow");
		String ch= Virat.nextLine();
		
		switch(ch)
		{
			case "Red":
			System.out.println("stop");
			break;
			
			case "Green":
			System.out.println("Go");
			break;
			
			case "yellow":
			System.out.println("Ready");
			break;

			
			default:
			System.out.println("Invalid colour");
		}
	}
}