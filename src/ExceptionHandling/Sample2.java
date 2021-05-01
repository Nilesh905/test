package ExceptionHandling;
import java.util.InputMismatchException;
public class Sample2 
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
		catch (ArrayIndexOutOfBoundsException e)
		{
			c = a / 1;
			System.out.println("ArrayIndexOutOfBoundsException found");
		}
		catch (InputMismatchException e)
		{
			c = a / 1;
			System.out.println("InputMismatchException found");
		}
		catch (ArithmeticException e)
		{
			c = a / 1;
			System.out.println("ArithmeticException found");
		}
		System.out.println(c);
		System.out.println("hii");
	}
}
