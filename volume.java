package slip8;
import java.util.*;
public class volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the radius");
       int r=sc.nextInt();
       double surfacearea= (4*3.14*(r*r));
       double Vol=((4/3)*3.14*(r*r*r));
       System.out.println("The surface area "+surfacearea);
       System.out.println("Volume is"+Vol);
       
       }

}
