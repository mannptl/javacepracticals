import java.util.*;
class Rectangle
{
	float length,breadth;
	Rectangle()
	{
	
	}
	Rectangle(float l,float b)
	{
		length=l;
		breadth=b;
	}
	void area()
	{
		System.out.println("Area of Rectangle is : "+(length*breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter of Ranctangle is : "+(2*length*breadth));
	}
}
class Square extends Rectangle
{
	float c;
	Square()
	{
	
	}
	
	Square(float length,float breadth,float d)
	{
	super(length,breadth);
	c=d;
	}
	void area_s()
	{
		System.out.println("Area of Square is : "+(c*c));
	}
	void perimeter_s()
	{
		System.out.println("Perimeter of Square is : "+(c*4));
	}
}

class P3
{
	public static void main(String args[])
	{
		Square o=new Square(21.1f,23.1f,34.1f);
		o.area();
		o.perimeter();
		o.area_s();
		o.perimeter_s();
		System.out.println("MANN PATEL D22DCE159");		
	
	}
}
