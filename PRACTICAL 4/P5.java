import java.util.*;

class Degree
{
	void getDegree()
	{
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree
{
	void display()
	{
			System.out.println("I am an undergraduate");
	}
}

class Postgraduate extends Degree
{
	void display()
	{
			System.out.println("I am an Postgraduate");
	}
}

class P5
{
	public static void main(String args[])
	{
	Degree d1=new Degree();
	Undergraduate d2=new Undergraduate();
	Postgraduate d3=new Postgraduate();
	d1.getDegree();
	d2.display();
	d3.display();
	System.out.println("MANN PATEL D22DCE159");

	}
}
