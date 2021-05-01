package collection;

import java.util.ArrayList;

public class _Arraylist 
{
public static void main(String[] args) 
{
ArrayList al = new ArrayList();
	al.add("ganesh");
	al.add('A');
	al.add(100);
	al.add(null);
	al.add(null);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains(100));
	System.out.println(al.get(3));
	System.out.println(al);
	al.add(3, 500);
	System.out.println(al.get(3));
	System.out.println(al.get(4));
	System.out.println(al);
	al.remove(3);
	System.out.println(al);
	al.set(2, 'B');
	System.out.println(al);
	
	
}
}
