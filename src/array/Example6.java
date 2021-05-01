package array;
import java.util.Arrays;
public class Example6
{
public static void main(String[] args) 
	{
			int ar [] = {10,50,40,20,30, 60};

			System.out.println("----original info---");
			for (int i = 0; i <= ar.length - 1; i++)
			{
				System.out.println(ar[i]);
			}		
			Arrays.sort(ar);
			System.out.println("---Asscending order-----");
			for(int i=0; i<=ar.length-1; i++) {
				System.out.println(ar[i]);
			}
			System.out.println("---desscending order-----");
			
			for(int i=ar.length-1; i>=0; i--) {
				System.out.println(ar[i]);
			}
		}
	}

