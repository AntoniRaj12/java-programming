import java.util.Scanner;
class odd
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the N value =  ");
		int n=scn.nextInt();
		System.out.println("-------------------");
		for(int i=0;n>=i;n--)
		{
			if(n%2!=0)
			{
				System.out.println(n);
			}
		}
	}
}