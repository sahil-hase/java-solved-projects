package slip12;
import java.util.*;
 class Coll {
	int cno;
	String cname;
	String caddr;
	public Coll(int cno,String cname,String caddr)
	{
		this.cno=cno;
		this.cname=cname;
		this.caddr=caddr;
	}
	
}
 class Department extends Coll{
	 int dno;
	 String dname;
	 public Department(int cno,String cname,String caddr,int dno,String dname)
	 {
		 super(cno,cname,caddr);
		 this.dno=dno;
		 this.dname=dname;
	 }
	 
	 void display()
	 {
		 System.out.println("cno"+"\t"+"cname"+"\t"+"cadrr"+"\t"+"dno"+"\t"+"dname");
		 System.out.println(cno+"\t"+cname+"\t"+caddr+"\t"+dno+"\t"+dname);
	 }
	
}

 public class College{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the college number");
	int cno=sc.nextInt();
	System.out.println("Enter the college name ");
	String cname=sc.next();
	System.out.println("Enter the college adress");
	String caddr=sc.next();
	System.out.println("Enter the department number  ");
	int dno=sc.nextInt();
	System.out.println("Enter the department name ");
	String dname=sc.next();
	Department d=new Department(cno,cname,caddr,dno,dname);
	d.display();
	
	

	}

}
