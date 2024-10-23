package Third;


import java.util.*;
import java.io.*;

public class tymark {

 public int theory;
 public int practicals;
public void accept() throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter third year theory and practicals mark outoff 300");
	theory=Integer.parseInt(br.readLine());
	practicals=Integer.parseInt(br.readLine());
}

}
