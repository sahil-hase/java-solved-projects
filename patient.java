package slip3;
import java.util.*;
 class patient {
	 String name;
	 int age;
	 int olevel;
	 int hrtc;
	 public patient(String name,int age,int olevel,int hrtc)
	 {
		 this.name=name;
		 this.age=age;
		 this.olevel=olevel;
		 this.hrtc=hrtc;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("How many patient");
        int n=sc.nextInt();
        patient p[]=new patient[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter name");
        	String name=sc.next();
        	System.out.println("enter age");
        	int age=sc.nextInt();
        	System.out.println("enter oxy level");
        	int olevel=sc.nextInt();
        	System.out.println("enter hrtc");
        	int hrtc=sc.nextInt();
        	p[i]=new patient(name,age,olevel,hrtc);
        }
        for(int i=0;i<n;i++)
        {
        	if(p[i].olevel < 95 && p[i].hrtc >10)
        	{
        		try {
        			throw new NullPointerException("Patient is covid positive");
        		}
        		catch(Exception e)
        		{
        			System.out.println(p[i].name+" is covid positive and need to hospitalized");
        		}
        	}
        	else
        	{
        		System.out.println("The details of the patient is:");
        		System.out.println(" name :"+p[i].name);
        		System.out.println(" Age :"+p[i].age);
        		System.out.println(" oxy level :"+p[i].olevel);
        		System.out.println(" HRTC :"+p[i].hrtc);
        		System.out.println();
        	}
        }

     }

}
