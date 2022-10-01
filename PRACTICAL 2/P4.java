import java.util.*;
class P4
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		String s=a.nextLine();
		
		double_char(s);
		System.out.println	(" D22DCE159 MANN PATEL" );
		
		
	}
	
	
	static void double_char(String str)
	{
		int i;
		String New = "";
		for(i=0 ; i< str.length(); i++)
		{
			New = New + str.charAt(i) + str.charAt(i);
			
		}
		System.out.println("EDITED STRING IS : "  );
		System.out.println(New);
		
	}
}



