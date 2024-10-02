class partten9
{
	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<6;j++)
			{
				if(i==5||i==1||(i==i && j==6-i))
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}