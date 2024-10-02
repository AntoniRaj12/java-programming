import java.util.Scanner;
class part3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter the values");
		int num=scn.nextInt();
		int temp=num;
		print(num,temp);
	}
	public static void print(int num,int temp)
	{
		int rev=0,rem=0;
		while (num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reversed values  = "+rev);
		System.out.println("given no. values = "+temp);
		if(temp==rev)
		{
			System.out.println("the given values is palindorome");
		}
		else
		{
			System.out.println("the given values is not palindorome");
		}
	}
}