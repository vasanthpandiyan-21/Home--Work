class Square
{
	public static void main(String[] args)
	{
		Square s = new Square();
		int res = s.Square(16);
		System.out.println(res);
	} 
	
	int Square(int a)
	{
		int sum = a*a;
		return sum;
	}
}