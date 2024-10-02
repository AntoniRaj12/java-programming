import java.util.Scanner;
class Sample3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter a String value:");
		String s=scn.nextLine();
		char ch=' ';
		System.out.println("------Result------");
		for (int i=0;i<=s.length()-1;i++)
		{
			ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
			System.out.println(ch);
			}
		}
	}
}