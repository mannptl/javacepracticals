import java.util.*;
class Shape
{
	void print_s()
	{
		System.out.println("This is Shape");
	}
}

class Rectangle extends Shape
{
	void print_r()
	{
		System.out.println("This is Rectanguler Shape");
	}
}

class Circle extends Shape
{
	void print_c()
	{
		System.out.println("This is Circuler Shape");
	}
}

class Square extends Rectangle
{
	void print_sq()
	{
		System.out.println("Square is a rectangle");
	}
}

class P4
{
	public static void main(String args[])
	{
		Square o=new Square();
		o.print_s();
		o.print_r();
		System.out.println("MANN PATEL D22DCE159");		

	}
}
