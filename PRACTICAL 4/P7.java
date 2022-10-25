import java.util.*;
interface Shape
{
	Scanner sc = new Scanner(System.in);
	default void color()
	{
		System.out.println("The color is white");
	}
}
interface Circle extends Shape
{
	default void area(float r , String s1)
	{
		System.out.println("This is a circle of area:" + (r*r) +" and the sign is " + s1); 
		Shape.super.color();
	}
}

interface Rectangle extends Shape
{
	default void area(float l , float b , String s)
	{
		System.out.println("This is a ractangle of area:"+ (l*b) + " and the sign is " + s);
		Shape.super.color();
	}
}

class P7 implements Circle , Rectangle
{
	static String s1, s2;
	void show()
	{
		Circle.super.area(10,s1);
		Rectangle.super.area(10,20,s2);
	}
	public static void main(String args[])
	{
		System.out.print("Please select a sign: left or right - ");
		s1=sc.next();
		System.out.print("\nPlease select a sign: up or down - ");
		s2=sc.next();
		P7 ob1 = new P7();
		ob1.show();
		System.out.println("MANN PATEL D22DCE159");
	}
}
