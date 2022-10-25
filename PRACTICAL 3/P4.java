import java.util.*;
public class P4
{
	Scanner sc=new Scanner(System.in);
	int month;
	int year;
	int date;
	
	P4()
	{
		month=0;
		year=0;
		date=0;
		set_m();
		set_y();
		set_d();
        System.out.println("-----------------");
		System.out.println("Month "+get_m());
		System.out.println("Year "+get_y());
		System.out.println("Date "+get_d());
        System.out.println("-----------------");
		displayDate();
	}
	void set_m()
	{
	System.out.println("Enter Month ");
	month=sc.nextInt();
	}
	void set_y()
	{
		System.out.println("Enter Year ");
	year=sc.nextInt();
	}
	void set_d()
	{
		System.out.println("Enter Date ");
	date=sc.nextInt();
	}
	int get_m()
	{
		return month;
	}
	int get_y()
	{
		return year;
	}
	int get_d()
	{
		return date;
	}
	void displayDate()
	{
				System.out.printf("%02d",date);
				System.out.print("/");
				System.out.printf("%02d",month);
				System.out.print("/");
				System.out.printf("%02d",year);
				System.out.println("");
	}
	public static void main(String args[])
	{
		P4 o = new P4();
        System.out.println("------------------");
	    System.out.println("MANN PATEL D22DCE159");
	}
}
