package ExceptionHandling;

public class Sample1 
{
	public static void main(String[] args) 
	{
        int a = 10;
		int b = 0;
		int c = 0;

		try 
		{
			c = a / b; // risky code
		} 
		catch (ArithmeticException e)
		{
			c=a/1;
			System.out.println("ArithmeticException found");
		}
		System.out.println(c);
        System.out.println("hii");

	}
}
