//Write a method that accepts 1 double, 1 int, 1 char value and return String
import java.util.Scanner;
class Method2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the any double value:");
		double a=scn.nextDouble();
		System.out.print("Enter the any int value:");
		int b=scn.nextInt();
		System.out.print("Enter the any char value:");
		char c=scn.next().charAt(0);
		m1(a,b,c);
	}
	public static String m1(double a,int b,char c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return "Hello Shubham Sir";
	}
}