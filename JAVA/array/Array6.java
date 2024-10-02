/* WAP TO Create int array for the user specified size,insert diff values into it and display all the values in reverse order*/
import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size:  ");
		int size=scn.nextInt();
		
		//create the array
		int[] a1=new int[size];
		
		//insert the values
		System.out.println("Enter the values:  ");
		for (int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scn.nextInt();
		}
		
		//do operation
		System.out.println("---result---");
		for (int i=size-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
	}
}