package constructor;

public class Testsample1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Sample1 s1 = new Sample1(50,50,50);
		s1.addition();
		Sample1 s2 = new Sample1(50,50);
		s2.addition();
		System.out.println("main method ended");
	}
}
