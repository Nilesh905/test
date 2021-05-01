package array;

public class Example8 
{
	// 10 20 25
	// 30 40 45
		public static void main(String[] args) 
		{
	//10 20 25
	// 30 40 45	
			int ar[][] = { { 10, 20, 25 }, { 30, 40, 45 } };

			// 2<=1
			for (int i = 0; i <= 1; i++) 
			{
				// 3<=2
				for (int j = 0; j <= 2; j++) 
				{ // 0 2
					System.out.print(ar[i][j] + " ");
				}
				System.out.println();
			}
		}
}

