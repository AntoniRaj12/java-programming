//Write a method that accepts 2 String value and return nothing
import java.util.Scanner;
class Method1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the any string1:");
		String s1=scn.next();
		System.out.print("Enter the any string2:");
		String s2=scn.next();
		calling(s1,s2);
	}
	public static void calling(String a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}