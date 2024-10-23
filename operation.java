package slip11;
import java.util.*;
interface Operations{
	double pi=3.142;
	void volume();
}

 class operation implements Operations {
	Scanner sc=new Scanner(System.in);
	 
	  public void volume()
	  {
		  System.out.println("Enter the radius");
		  int radius=sc.nextInt();
		  System.out.println("Enter the height");
		  int height=sc.nextInt();
		 double vol =pi*radius*radius*height;
		 System.out.println("The volume is  "+vol);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       operation o=new operation();
       o.volume();
	}

}
