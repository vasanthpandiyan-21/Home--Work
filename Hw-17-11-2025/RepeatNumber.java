class RepeatNumber
{
	public static void main (String[] args)
	{
		int ar[] = {10,2,2,3,3,5};
		int target = 2;
		
		RepeatNumber vs = new RepeatNumber();
		int result = vs.num(ar,target);
		System.out.println(result);
	}
	
	
		int num (int ar[], int target)
		
		{
			int count = 0;
			for (int i = 0; i<ar.length; i++)
			{
				if(ar[i]==target)
				{
					count++;
				}
			}
			return count++;
		}
	
}