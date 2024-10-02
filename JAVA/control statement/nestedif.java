class nestedif
{
	public static void main(String[] args)
	{
		int salary=5100;
		
		if (salary>=5000)
		{
			int yoe=4;
			
			if (yoe>=5)
			{
				System.out.println("eligible for 20% increment");
			}
			else
			{
				System.out.println("eligible for 10% increment");
			}
		}
		else
		{
			System.out.println("not eligible increment");
		}
	}
}