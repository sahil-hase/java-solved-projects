package slip13;
import java.util.*;
import java.io.*;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String filename = args[0];
      
       
        try  {
        	  FileReader fis=new FileReader(filename);
          	BufferedReader bis = new BufferedReader(fis);
            String line;
            int wordCount = 0;
            int lineCount = 0;

            if ((line = bis.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
	}


