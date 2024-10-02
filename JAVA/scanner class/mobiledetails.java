import java.util.Scanner;
class mobiledetails
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter name of the phone:");
		String name=scn.nextLine();
		System.out.print("enter model no. of the phone:");
		int id=scn.nextInt();
		System.out.print("enter RAM:");
		String ram=scn.next();
		System.out.print("enter ROM");
		String rom=scn.next();
		System.out.print("enter Camera");
		int cam=scn.nextInt();
		System.out.print("enter Processor:");
		int pro=scn.nextInt();
		System.out.print("enter offer:");
		String off=scn.next();
		System.out.print("---------------------------------------------------");
		System.out.print("Name:                      "+name);
		System.out.print("Model no.:                 "+id);
		System.out.print("RAM:                       "+ram);
		System.out.print("ROM:                       "+rom);
		System.out.print("Camera:                    "+cam);
		System.out.print("Processor:                 "+pro);
		System.out.print("Offer:                     "+off);
	}
}