import java.util.Scanner;
class sumofeven
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the N value =  ");
		int n=scn.nextInt();
		System.out.println("-------------------");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}