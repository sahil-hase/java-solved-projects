package slip21;
import java.util.*;
public class Date {
	
	int day,month,year;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the date in format day/month/year");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
	}
    void display()
    {
    	System.out.println("The Date is: "+day+"/"+month+"/"+year);
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Date d=new Date();
		d.accept();
		if(d.day<0 || d.day>=31 || d.month<0 || d.month >=12)
		{
			throw new Exception("INVALID DATE");
		}
		else
		{
			d.display();
		}

	}

}
