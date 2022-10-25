import java.util.*;
interface AdvancedAri
{
	int divisor_sum(int n);
}

class MyCalc implements AdvancedAri
{
	public int divisor_sum(int x)
	{
		int s=0;
		System.out.println("The divisors are:");
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				System.out.println(i);
				s=s+i;
			}
		}
		return s;
	}
}

class P6
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int y;
		MyCalc ob1= new MyCalc();
		AdvancedAri ob2= new MyCalc();
		System.out.println("Please enter your number"); //using class object
		y=s.nextInt();
		System.out.println("The sum of divisor is :"+ob1.divisor_sum(y));
		System.out.println("Please enter your number"); //using reference
		y=s.nextInt();
		System.out.println("The sum of divisor is :"+ob2.divisor_sum(y));
		System.out.println("MANN PATEL D22DCE159");
	}
}
