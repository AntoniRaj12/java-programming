import java.util.Scanner;
class countofodd
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the N value =  ");
		int n=scn.nextInt();
		System.out.println("-------------------");
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}