package slip14;
import java.util.*;
import java.io.*;

public class prime {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n==0)
		{
			throw new Exception("Number is Zero");
		}
		else
		{
			int count=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}

	}

}
