package generalization;

public class Testgeneralization 
{
 static public  void main (  String []abc )
{
	System.out.println("features of Jio simcard");
	Jio j = new Jio ();
	j.audiocalling();
	j.sms();
	j.internet();
	j.newfeatureA();
	

	 System.out.println("features of idea simcard");
	 Idea i = new Idea ();
	 i.audiocalling();
	 i.sms();
	 i.internet();
	 i.newfeatureB();
 }
}

