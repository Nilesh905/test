package array;
public class Example4 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		String s1 = "abc";
		String s2 = "ghj";
		String s3 = "lmn";
		String s4 = "pqr";
		System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4);
		System.out.println(s.equals(s1));
		s = s+"Java";
		System.out.println(s);
		System.out.println(s.equals(s1));
		String s5 = new String("JAVA");
		System.out.println(s5);
		s5=s5+"J2EE";
		System.out.println(s5);
		System.out.println(s.concat("xyz"));
		s5=s5.concat(s1);
		System.out.println(s5);
		}
}

