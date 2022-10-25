import java.util.*;
public class P2
{
	double h=0,b=0;
	P2()
	{
		h=5;
		b=4;
				System.out.println((h*b)/2);

	}
	P2(double a)
	{
		h=a;
		b=a;
				System.out.println((h*b)/2);

	}
	P2(float c,float d)
	{
		h=c;
		b=d;
		System.out.println((h*b)/2);
	}
	
	public static void main(String args[])
	{
		P2 o=new P2();
		P2 g=new P2(4.54);
		P2 v=new P2(6.5f,5.3f);
		System.out.println("MANN PATEL D22DCE159");
	}
				

}

