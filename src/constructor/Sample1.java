package constructor;
public class Sample1 
{
int a;
int b;
int m;
 Sample1 ()
{
	a=0;
	b=0;
}
 Sample1 ( int c, int d)
 {
	 a=c;
	 b=d;
 }
	Sample1(int c, int d, int L)
	{
		a= c;
		b= d;
		m= L;
	}
	public void addition()
	{
		System.out.println(m+a+b);
		
	}
}
