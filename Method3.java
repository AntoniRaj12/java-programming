//Write a method that accepts 1 int, 1 boolean, 1 String, 1 char value and return double
import java.util.Scanner;
class Method3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the any int value:");
		int a=scn.nextInt();
		System.out.print("Enter the any boolean value:");
		boolean b=scn.nextBoolean();
		System.out.print("Enter the any string value:");
		String c=scn.next();
		System.out.print("Enter the any char value:");
		char d=scn.next().charAt(0);
		double x=m1(a,b,c,d);
		System.out.println("return ="+x);
		
	}
	public static double m1(int a,boolean b,String c,char d)
	{
		System.out.println("int ="+a);
		System.out.println("boolean ="+b);
		System.out.println("String ="+c);
		System.out.println("Character ="+d);
		return 10.1;
	}
}