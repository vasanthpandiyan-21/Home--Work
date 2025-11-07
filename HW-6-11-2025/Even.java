class Even
{
	public static void main(String[] args)
	{
		Even s = new Even();
		boolean res = s.Even(10);
		System.out.println(res);
		
	}
	
	boolean Even(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}