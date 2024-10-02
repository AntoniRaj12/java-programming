import java.util.Scanner;
class rect
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("1 for integer");
		System.out.println("2 for decimal");
		System.out.print("Enter your choice:");	
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1:System.out.print("Enter the length:");
			int length1=scn.nextInt();
			System.out.print("Enter the height:");
			int height1=scn.nextInt();
			int area1=length1*height1;
			System.out.println("area = "+area1);
			break;
			case 2:System.out.print("Enter the length:");
			float length2=scn.nextFloat();
			System.out.print("Enter the height:");
			float height2=scn.nextFloat();
			float area2=length2*height2;
			System.out.println("area = "+area2);
			break;
			default :System.out.println("invalid choice");
		}
	}
}