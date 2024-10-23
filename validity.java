package slip11;
import java.util.*;


public class validity {
    public static void main(String[] args) throws Exception{
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

       
        if (username.equals(password)) {
        	System.out.println("Accepted");
            
        } else {
        	throw new Exception("Invalid Password");   
        }
    
        
    }

    
        
}