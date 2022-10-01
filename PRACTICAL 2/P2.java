import java.util.*;
class P2
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("ENTER NUMBER OF NUMBERS : " );
		
		int n=a.nextInt();
		int c[]=new int[n];
			System.out.println("ENTER NUMBERS : " );
		for(int i=0;i<n;i++)
		{
		    c[i]=a.nextInt();
		}
	int ans=array_count9(c);
	System.out.println("NUMBER OF 9's are : " );
	System.out.println(ans);
	System.out.println("D22DCE159 MANN PATEL ");
	}
	
		
		
	
	static int array_count9(int c[])
	{
		int count=0;
		for(int j=0;j<c.length;j++)
		{
		    if(c[j]==9)
		    {
		        count++;
		    }
		}
		return count;
		
	}
}
