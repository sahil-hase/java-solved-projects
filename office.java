package slip1;
import java.util.*;
abstract class staff
{
	protected int id;
	protected String name;
	public staff(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
} 
class officestaff extends staff
{
    String Dept;
	public officestaff(int id, String name,String Dept)
	{
		super(id, name);
		this.Dept=Dept;
	}
	void display() 
	{
		System.out.println(id+" "+name+" "+Dept);
	}
}
public class office 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements");
		int n = sc.nextInt();
		officestaff[] os = new officestaff[n];
		for(int i=0; i<n;i++)
		{
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			System.out.println("Enter name");
		    String name = sc.next();
			
			System.out.println("Enter dept");
			String Dept = sc.next();
			
			os[i]= new officestaff(id, name,Dept);
		}
		for(int j=0;j<n;j++) {
			os[j].display();
		}
	}

}
