package slip21;
import java.util.*;
class Emp{
	int id;
	String name;
	String depname;
	int year;
	public Emp() {}
	public Emp(int id,String name,String depname,int year)
	{
		this.id=id;
		this.name=name;
		this.depname=depname;
		this.year=year;
	}
	public  void display()
	{
		
		System.out.println(id+" "+name+" "+depname+" "+year);
	}
}
public class employee {

	public static void main(String[] args) {
		int count=0;
		Emp e1=new Emp(1,"Rushi","comp",2003);
		e1.display();
		count++;
		System.out.println("Object "+count+" created");
		
		
		
		System.out.println("Object  count "+count);
		
		
	}

}
