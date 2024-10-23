package slip10;
import java.util.*;
import java.io.*;
interface functional{
	int cube(int number);
}
public class function {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		functional c = number -> number*number*number;
		System.out.println("Enter the number");
		int number=sc.nextInt();
		 
		int result=c.cube(number);
		System.out.println("THe cube of given number is"+result);
	}

}
