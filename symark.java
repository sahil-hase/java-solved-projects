package Second;


import java.util.*;
import java.io.*;
public class symark {

	public int computer;
	 public int math;
	 public int electronics;
	public void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter second year the marks of computer,math and electronics outoff 100");
		computer=Integer.parseInt(br.readLine());
		math=Integer.parseInt(br.readLine());
		electronics=Integer.parseInt(br.readLine());
		
	}
	
}

