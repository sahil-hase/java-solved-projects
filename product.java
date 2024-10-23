package slip9;
import java.util.*;
import java.io.*;
interface marker{
	
}
public class product implements marker {
	int pid;
	String pname;
	int pcost;
	int pquanti;
	public product()
	{
		this.pid=0;
		this.pname="";
		this.pcost=0;
		this.pquanti=0;
	}
	public product(int pid,String pname,int pcost,int pquanti)
	{
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		this.pquanti=pquanti;
	}
	void display() {
		System.out.println("Product id: "+pid);
		System.out.println("Product name: "+pname);
		System.out.println("Product cost: "+pcost);
		System.out.println("Product quantity: "+pquanti);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the object you want");
		int n=sc.nextInt();
		product[] p=new product[n];
		int obj=n;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the product id");
			int pid=sc.nextInt();
			System.out.println("Enter the product name");
			String pname=sc.next();
			System.out.println("Enter the product cost");
			int pcost=sc.nextInt();
			System.out.println("Enter the product quantity");
			int pquanti=sc.nextInt();
			p[i]=new product(pid,pname,pcost,pquanti);
			
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
			System.out.println();
		}
		System.out.println("Object count is"+obj);
	}

}
