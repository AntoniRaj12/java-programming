import java.util.Scanner;
class part1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter values:");
		int num=scn.nextInt();
		int fib1=0,fib2=1,fib3=fib1+fib2;
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(fib1);
			fib1=fib2;
			fib2=fib3;
			fib3=fib2+fib1;
		}
	}
}