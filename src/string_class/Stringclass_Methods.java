package string_class;

public class Stringclass_Methods 
{
public static void main(String[] args) 
{
	String s1 = "velocity";
	String s2 ="VELOCITY";
	String s3 ="city";
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s2.replace("Y","J"));
	System.out.println(s2.isEmpty());
	System.out.println(s2.concat(s3));
	System.out.println(s2.substring(4,7));
	System.out.println(s2.substring(4));
	System.out.println(s1.endsWith("ty"));
	System.out.println(s1.startsWith("ve"));
	System.out.println(s1.lastIndexOf('t'));
	System.out.println(s1.indexOf('t'));
	System.out.println(s1.charAt(0));
	System.out.println(s1.contains(s3));
	System.out.println(s1.equals(s2));
	System.out.println(s2.equalsIgnoreCase(s1));
}
}
