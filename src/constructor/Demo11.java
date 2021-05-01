package constructor;
public class Demo11
{
	int x;
	int y;
	int z;
private Demo11 ()
	{
		x=50;
		y=30;
	}
	 Demo11 ( int c, int d)
	 {
		 x=c;
		 y=d;
	 }
	 Demo11 (int c, int d, int L)
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
		public static void main(String[] args)
		{
				Demo11 s1 = new Demo11();
				s1.addition();
				Demo11 s2= new Demo11 (10,30);
				s2.addition();
				Demo11 s3 = new Demo11 (10,20,30);
				s3.addition();
		}
}
