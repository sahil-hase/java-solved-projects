package slip15;
import java.io.*;

public class copyfile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader fis1=new FileReader(args[0]);
		 BufferedReader read = new BufferedReader(fis1);
		 FileWriter fis2=new FileWriter(args[1]);
	        BufferedWriter writes = new BufferedWriter(fis2);

	        String line;
	        while ((line = read.readLine()) != null) {
	            writes.write(line);
	            writes.newLine();
	        }
           System.out.println("Succesfully copied");
	        read.close();
	        writes.close();

	}

}
