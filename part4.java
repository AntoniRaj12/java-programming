import java.util.Scanner;
class part4
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a String Value:");
		String s1=scn.nextLine();
		print(s1);
	}
	public static void print(String s1)
	{
		String rev="";
		char ch1=' ';
		for (int i=s1.length()-1;i>=0;i--)
		{
			ch1=s1.charAt(i);
			rev=rev+ch1;
		}
		System.out.println("Given string value = "+s1);
		System.out.println("Palindorome value  = "+rev);
		if(rev.equals(s1))
		{
			System.out.println("Given string is palindorome");
		}
		else
		{
			System.out.println("Given string is not a palindorome");
		}
	}
}