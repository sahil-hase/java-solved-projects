package slip15;
import java.util.*;
import java.io.*;
class Account{
	String custname;
	int accno;
	public Account() {}
	public Account(String custname,int accno) {
		this.custname=custname;
		this.accno=accno;
		
	}
}
 class Savingaccount extends Account{
	int savingbal,minbal;
	public Savingaccount(String custname,int accno,int savingbal,int minbal)
	{
		super(custname,accno);
		this.savingbal=savingbal;
		this.minbal=minbal;
	}
}
 class Accountdetails extends Savingaccount{
	 int depositamt,withdrawlamt;
	 
	 public Accountdetails(String custname,int accno,int savingbal,int minbal,int depositamt,int withdrawlamt)
	 {
		 super(custname,accno,savingbal,minbal);
		 this.depositamt=depositamt;
		 this.withdrawlamt=withdrawlamt;
	 }
	 void display()
	 {
		 System.out.println("customer name"+custname);
		 System.out.println("Account number"+accno);
		 System.out.println("savings"+savingbal);
		 System.out.println("minimum bal"+minbal);
		 System.out.println("Deposit amt"+depositamt);
		 System.out.println("withdawl amt"+withdrawlamt);
	 }
 }

public class acc {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name");
		String custname=sc.next();
		System.out.println("Account no");
		int accno=sc.nextInt();
		System.out.println("min bal");
		int minbal=sc.nextInt();
		
		System.out.println("Amount to deposit");
		int depositamt=sc.nextInt();
		System.out.println("Amt to withdrawl");
		int withdrawlamt=sc.nextInt();
		int savingbal= depositamt-withdrawlamt;
		Accountdetails A=new Accountdetails(custname,accno,savingbal,minbal,depositamt,withdrawlamt);
	
		A.display();

	}

}
