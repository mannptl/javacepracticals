import java.util.*;
class P1
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String s=a.nextLine();
		
		System.out.println("Enter an int : ");
		int n=a.nextInt();
		
		front_times(s,n);
		System.out.println("");
		System.out.println("D22DCE159 MANN PATEL");
	}
	
		
	static void front_times(String s,int n)
	{
		for(int j=0;j<n;j++)
		{
		   System.out.print(s.substring(0,3));
		}
				
	}
}
