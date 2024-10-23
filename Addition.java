package slip20;
import java.util.*;
class Add{
	int a,b;
	void add(int a,int b) {
		int resultadd=a+b;
		System.out.println("Addition is "+resultadd);
		
	}
	void sub(int a,int b) {
		int resultsub=a-b;
		System.out.println("sub is "+resultsub);
	}
}
class maximum extends Add{
	void max(int a,int b)
	{
	if(a<b)
	{
		System.out.println("max is "+b);
		
	}
	else
		
	{
		System.out.println("max is "+a);
	}
	}
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		maximum m=new maximum();
		m.add(a, b);
		m.sub(a, b);
		m.max(a, b);

	}

}
