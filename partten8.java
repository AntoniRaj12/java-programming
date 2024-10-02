class partten8
{
	public static void main(String[] args)
	{
		int x=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<6;j++)
			{
				if(i==j||(i==i && j==6-i))
				{
					System.out.print(x+"\t");
					x++;
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