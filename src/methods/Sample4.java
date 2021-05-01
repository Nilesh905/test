package methods;

public class Sample4 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	Sample4 s1 = new Sample4 ();
	s1.m4();
	Sample4 s2 = new Sample4();
	s2.m5();
	System.out.println("main method ended");
}
public  void m4()
{
	System.out.println("running non static method from same class:m4");
}
public void m5()
{
	System.out.println("running non static method from same class:m5");
}
}
