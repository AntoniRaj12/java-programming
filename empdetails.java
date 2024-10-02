import java.util.Scanner;
class empdetails
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter name of the employees:");
		String name=scn.nextLine();
		System.out.print("enter ID no. of the employees:");
		int id=scn.nextInt();
		System.out.print("enter designation of the employees:");
		String job=scn.next();
		System.out.print("enter hiredate");
		String date=scn.next();
		System.out.print("enter salary");
		int sal=scn.nextInt();
		System.out.print("enter deptno of the employees:");
		int deptno=scn.nextInt();
		System.out.print("enter job location:");
		String loc=scn.next();
		System.out.print("---------------------------------------------------");
		System.out.print("Name:                 "+name);
		System.out.print("ID no.:               "+id);
		System.out.print("Job:                  "+job);
		System.out.print("Hiredate:             "+date);
		System.out.print("Salary:               "+sal);
		System.out.print("Deptno:               "+deptno);
		System.out.print("Location:             "+loc);
	}
}