import java.util.Scanner;
class multiple7
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the n value = ");
		int n=scn.nextInt();
		System.out.println("--------------------");
		int i=1;
		while (i<=n)
		{
			System.out.println("7x"+i+"="+(7*i));
			i++;
		}
	}
}