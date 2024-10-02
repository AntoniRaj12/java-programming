class partten5
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			int a=1;
			char ch='a';
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(ch+"\t");
					ch++;
				}
				else
				{
					System.out.print(a+"\t");
					a++;
				}
			}
			System.out.println();
		}
	}
}