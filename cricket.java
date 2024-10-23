package slip2;
import java.util.*;

public class cricket {
  String name;
  int ing_no;
  int notout;
  int runs;
   float batavg;
  public  cricket(String name,int ing_no,int notout,int runs)
  {
	  this.name=name;
	  this.ing_no=ing_no;
	  this.notout=notout;
	  this.runs=runs;
	  this.batavg=avg(runs,ing_no);
  }
  public static float avg(int runs,int ing_no)
  {
	return (float) runs/ing_no;  
  }
  public static void sort(cricket[] players)
  {
	  for(int i=0;i<players.length-1;i++)
	  {
		  for(int j=i+1;j<players.length-1;j++)
		  {
			  if(players[j].batavg>players[j+1].batavg)
			  {
				  cricket temp=players[j];
				  players[j]=players[j+1];
				  players[j+1]=temp;
				  
			  }
		  }
	  }
  }
  public static void display(cricket[] players)
  {
	     for(cricket player : players) {
		  System.out.println("Name of player"+player.name);
		  System.out.println("Name of inn"+player.ing_no);
		  System.out.println("Name of notout"+player.notout);
		  System.out.println("Name of runs"+player.runs);
		  System.out.println("Name of avg"+player.batavg);
		  System.out.println();
		  
	     }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter total of players: ");
        int n=sc.nextInt();
        cricket[] players=new cricket[n];
        for(int i=0;i<n;i++)
        {
        	 System.out.println("Name of player");
        	 String name=sc.next();
        	 System.out.println("No if inngings");
        	 int ing_no=sc.nextInt();
        	 System.out.println("notouts");
        	 int notout=sc.nextInt();
        	 System.out.println("total tuns");
        	 int runs=sc.nextInt();
        	players[i]=new cricket(name,ing_no,notout,runs);
        	
        	 
        }
        sort(players);
        display(players);
        
        }

}
