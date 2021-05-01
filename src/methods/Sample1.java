package methods;

public class Sample1 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	m1();
	m2();
    System.out.println("main method ended");
}
public static void  m1()
{
	System.out.println("running static method: m1");
}
public static void m2()
{
	System.out.println("running static method: m2");
}
}
