package methods;

public class Sample8 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	addition(10,50);
	Sample8 mul = new Sample8();
	mul.multiplication(20,30);

	System.out.println("main method ended");
}
	public static void addition(int a,int b)
	{
		int c = a+b;
		System.out.println("addition :"+c);
	}
	public void multiplication(int a,int b)
	{
		int c= a * b;
		System.out.println("multiplication:" +c);
	}
}
