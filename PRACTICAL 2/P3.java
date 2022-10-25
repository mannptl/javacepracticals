import java.util.*;
public class P3{

	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF NUMBERS : ");
		int n=a.nextInt();
		
		
		int c[]=new int[n];
		
			System.out.println("ENTER NUMBERS : \n ");
			
			for(int i=0;i<n;i++)
			{
				c[i]=a.nextInt();
			}
		
	boolean ans=array_count9(c);
	System.out.println("\n " );
	
	System.out.print(ans);
	System.out.print("\n");
	System.out.println("\n D22DCE159 MANN PATEL");

	}

	static boolean array_count9(int c[])
	{
	boolean b=false;
		for(int j=0;j<4;j++)
		{
		    if(c[j]==9)
		    {
		     b=true;
		    }
		}
		return b;	}
}
