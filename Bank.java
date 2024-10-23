package slip7;
import java.util.*;
public class Bank {
	
	float balance;
  public Bank() {
	  balance=0;
  }
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		float deposit_amt,withdrawl_amt;
		
		System.out.println("Enter the amout to deposit");
		deposit_amt=sc.nextFloat();
		b.balance=b.balance+deposit_amt;
		System.out.println("Enter the amout to withdraw");
		withdrawl_amt=sc.nextFloat();
		b.balance=b.balance-withdrawl_amt;
		System.out.println("Details of account");
		System.out.println("Balance:"+b.balance);
		System.out.println("Deposit:"+deposit_amt);
		System.out.println("Withdraw:"+withdrawl_amt);
		
		
		

	}

}
