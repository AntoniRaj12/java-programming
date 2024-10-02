//WAP to display all odd number between 1 to n in reverse order
import java.util.Scanner;
class Method4
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.print("Enter N value =");
		int n=scn.nextInt();
		reverse(n);
	}
	public static void reverse(int n)
	{
		System.out.println("-----Result-----");
		for(int i=n;i>=1;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}