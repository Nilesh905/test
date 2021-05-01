package methods;

public class Sample11
{
public static void main(String[] args)
{
	System.out.println("main method started");
	
	final Sample9 sub = new Sample9();
	sub.substraction (80 , 20);
	
	final  Sample9 div = new Sample9();
	div.divide (50 , 50);
	
	Sample10 mul = new Sample10();
	mul.multiplication(100, 1);
	
	System.out.println("main method ended");
}	
}


	
	
	
	
	
	

