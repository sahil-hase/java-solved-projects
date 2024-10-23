package slip1;

public class primenumber {
    public static void main(String[] args) {
       int[] numbers= new int[args.length];
       for(int i=0;i<args.length;i++)
       {
    	   numbers[i]=Integer.parseInt(args[i]);
       }
       for(int num : numbers)
       {
    	   int count=0;
    	   for(int i=2;i<num;i++)
    	   {
    		   if(num%i==0)
    		   {
    			   count++;
    		   }
    	   }
    	   if(count==0)
    	   {
    		   System.out.println(num);
    	   }
       }
    }
}