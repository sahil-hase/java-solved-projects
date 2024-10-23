package slip13;
import java.util.*;
import java.text.*;
import java.time.*;
public class Current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Date D=new Date();
   SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
   System.out.println("Current date is "+f1.format(D));
   SimpleDateFormat f2=new SimpleDateFormat("MM-dd-yyyy");
   System.out.println("Current date is "+f2.format(D));
   SimpleDateFormat f3=new SimpleDateFormat("EEEE MMMM dd yyyy");
   System.out.println("Current date is "+f3.format(D));
   SimpleDateFormat f4=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
   System.out.println("Current date is "+f4.format(D));
   SimpleDateFormat f5=new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
   System.out.println("Current date is "+f5.format(D));
	}

}
