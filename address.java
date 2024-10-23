package slip20;
import java.util.*;
import java.io.*;





class continent{
	String conti;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void getconti()throws IOException
	{
		System.out.println("Enter the contitnent: ");
	    conti=br.readLine();
	}
}
class country extends continent{
	String contry;
	void getcountry()throws IOException {
		System.out.println("Enter the country: ");
		contry=br.readLine();
	}
}
class state extends country{
	String state;
	void getstate()throws IOException {
		System.out.println("Enter the state: ");
		 state=br.readLine();
	}
}
class place extends state{
	String place;
	void getplace()throws IOException {
		System.out.println("Enter the Place: ");
	 place=br.readLine();
	}
}
public class address {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		place p=new place();
		p.getplace();
		p.getstate();
		p.getcountry();
		p.getconti();
		System.out.println("Countinent :"+p.conti);
		System.out.println("Country :"+p.contry);
		System.out.println("State :"+p.state);
		System.out.println("Place :"+p.place);
       
	}

}
