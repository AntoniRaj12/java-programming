class switchcls
{
	public static void main(String[] args)
	{
		int num1=100;
		int num2=50;
		int choice=4;
		
		switch(choice)
		{
			case 1:System.out.println(num1+num2);
			break;
			case 2:System.out.println(num1-num2);
			break;
			case 3:System.out.println(num1*num2);
			break;
			case 4:System.out.println(num1/num2);
			break;
			case 5:System.out.println(num1%num2);
			break;
			default :System.out.println("invalid choice");
		}
		
	}
}