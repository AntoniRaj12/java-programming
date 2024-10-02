import java.util.Scanner;
class Sample1
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
			System.out.println(ch);
		}
	}
}