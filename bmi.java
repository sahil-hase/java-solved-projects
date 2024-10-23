package slip2;

public class bmi {

	public static void main(String[] args) {
		String fname=args[0];
		String lname=args[1];
		float hei=Float.parseFloat(args[2]);
		float wei=Float.parseFloat(args[3]);
		
		float bmi= wei/hei*hei;
		System.out.println("First name :"+fname);
		System.out.println("last name :"+lname);
		System.out.println("BMI is :"+bmi);
		// TODO Auto-generated method stub

	}

}
