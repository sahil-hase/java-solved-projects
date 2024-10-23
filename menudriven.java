package slip5;
import java.util.*;
public class menudriven {

	public static void main(String[] args) {
		int q=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the columns: ");
		int cols=sc.nextInt();
		int[][] matrixone=new int[rows][cols];
		int[][] matrixtwo=new int[rows][cols];
		System.out.println("Enter the first matrix");
		for(int i=0;i<matrixone.length;i++)
		{
			for(int j=0;j<matrixone[0].length;j++)
			{
				matrixone[i][j]=sc.nextInt();
			}
		}
		// TODO Auto-generated method stub
		System.out.println("Enter the second matrix");
		for(int i=0;i<matrixone.length;i++)
		{
			for(int j=0;j<matrixone[0].length;j++)
			{
				matrixtwo[i][j]=sc.nextInt();
			}
		}
		do {
			System.out.println("1.Addition");
			System.out.println("2.multiplication");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				int[][] add=new int[rows][cols];
				for(int i=0;i<matrixone.length;i++)
				{
					for(int j=0;j<matrixone[0].length;j++)
					{
						add[i][j]=matrixone[i][j]+matrixtwo[i][j];
					}
				}
				System.out.println("The added matrix is");
				for(int i=0;i<matrixone.length;i++)
				{
					for(int j=0;j<matrixone[0].length;j++)
					{
						System.out.print(add[i][j]+"\t");
					}
					System.out.println();
				}
				break;
			case 2:
				int[][] mul=new int[rows][cols];
				for(int i=0;i<matrixone.length;i++)
				{
					for(int j=0;j<matrixtwo[0].length;j++)
					{
						for(int k=0;k<matrixone[0].length;k++)
						{
						mul[i][j]=matrixone[i][k]*matrixtwo[k][j];
						}
					}
				}
				System.out.println("The multiplication matrix is");
				for(int i=0;i<matrixone.length;i++)
				{
					for(int j=0;j<matrixone[0].length;j++)
					{
						System.out.print(mul[i][j]+"\t");
					}
					System.out.println();
				}
				break;
			case 3:q=1;
			     break;
			}
			
			
		}while(q==0);

	}

}
