package constructor;
public class pratice11
{
	int x;
	int y;
	int z;
 pratice11 ()
	{
		x=50;
		y=30;
	}
	 pratice11 ( int c, int d)
	 {
		 x=c;
		 y=d;
	 }
	 pratice11 (int c, int d, int L)
		{
			x= c;
			y= d;
			z= L;
		}
		public void addition()
		{
			System.out.println(x+y+z);
			System.out.println("running non static method: m11 ");
		}
}
