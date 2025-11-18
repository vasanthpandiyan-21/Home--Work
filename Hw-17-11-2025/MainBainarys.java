class MainBainarys
{
	public static void main (String []args)
	{
		int []ar={5,7,7,8,8,10};
		int target=8;
		MainBainarys mb =new MainBainarys();
		String res=mb.bainary(ar,target);
	System.out.println(res);
	}
	
       String bainary (int ar[],int target)
	   {
		   int start =0;
		   int end = ar.length-1;
		   int mid =0;
		   while (start<=end)
		   {
			   mid =(start+end)/2;
		   
			   if (ar[mid]==target)
			   {
				   String vs =Integer.toString(mid);
				   return vs;
	            }
				else if(ar [mid]<=target)
				{
					start=mid +1;
                }
				else if (ar[mid]>=target)
				{
					end =mid-1;
				}
		   }  return "invalid";
	   }    
}