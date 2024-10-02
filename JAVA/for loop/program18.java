class program18
{
	public static void main (String[] args)
	{
		int num=23;
		int sum=0;
		
		for (int i=1;i<=num-1;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("num             ="+num);
		System.out.println("sum of factor	="+sum);
if (sum==num)
{
	System.out.println("it's prefect number");
}	
else 
{
	System.out.println("it's not prefect number");
}
	}
}