package slip9;
import java.util.*;
import java.io.*;
public class clock {
    int hrs,min,sec;
    public clock(int hrs,int min,int sec)
    {
    	this.hrs=hrs;
    	this.min=min;
    	this.sec=sec;
    }
    public static void validity(int hrs,int min,int sec)
    {
    	String mode;
    	
    	if(hrs>0 && hrs<24 && min>0 && min<60 && sec>0 && sec<60 ) {
    		if(hrs<12)
    		{
    			mode="AM";
    		}
    		else
    		{
    			mode="PM";
    		}
    		System.out.println(hrs%12+":"+min+":"+sec+""+mode);
    	}
    	else
    	{
    		System.out.println("The time is invalid");
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
         System.out.println("Enter the hrs");
         int hrs=sc.nextInt();
         System.out.println("Enter the min");
         int min=sc.nextInt();
         System.out.println("Enter the sec");
         int sec=sc.nextInt();
         clock c=new clock(hrs,min,sec);
         c.validity(hrs,min,sec);
         
         
	}

}
