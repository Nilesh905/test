package array;

public class Example2 
{
public static void main(String[] args)
{
String ar []= new String [5];
       ar [0]= "ganesh";
       ar [1]= "ramesh";
       ar [2]= "suresh";
       ar [3]= "mahesh";
       ar [4]= "rahul";
       
       System.out.println(ar [3]);
       
       int size = ar. length ;
       
       System.out.println("array size: "+size);
       System.out.println("--print all info in array--");
       for(int i=0;i<=size-1;i++)
       {
    	   System.out.println(ar[i]);
       }
}
}
