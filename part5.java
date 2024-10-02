import java.util.Scanner;
class part5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter values:");
		int value=scn.nextInt();
		int[] a1={80,20,30,100,50,60,10};
		for (int i=0;i<=a1.length-1;i++)
		{
			if(value==a1[i])
			{
				System.out.println("position of given number:"+i);
			}
		}
	}
}