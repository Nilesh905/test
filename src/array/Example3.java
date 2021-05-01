package array;

public class Example3 
{
	public static void main(String[] args)
	{
	String ar []= new String [5];
	       ar [0]= "ganesh";
	       ar [1]= "ramesh";
	       ar [2]= "suresh";
	       ar [3]= "mahesh";
	       ar [4]= "rahul";
	    	 
	       System.out.println("--print all in revers order--");
	       for (int i=ar.length-1;i>=0;i--)
	       {
	    	   System.out.println(ar[i]);
	       }
	}
}
