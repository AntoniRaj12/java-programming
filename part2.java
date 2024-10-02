import java.util.Scanner;
class part2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter values:");
		int num=scn.nextInt();
		int fact=1;
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}
}