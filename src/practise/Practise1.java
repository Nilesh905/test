package practise;

public class Practise1 
{
	public void m1()
	{
	System.out.println("non static method call from same class :m1");
	}
	public static void m2()
	{
	System.out.println("static method call from diff class :m2");
	}
	public static void main (String[] arg)
	{
		Practise1  a = new Practise1 ();
	a.m1();
	}
}
