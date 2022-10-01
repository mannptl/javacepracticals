import java.util.*;

public class P5
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER STRING OF WORDS : \n ");
String a=sc.nextLine();
String b="";
char ch;


for(int i=0;i<a.length();i++)
{
 ch=a.charAt(i);  
b=ch+b;
}
  
	String str="";
	String str1=" ";
      String[] w=b.split("\\s");
   for(int i=0;i<w.length;i++)
	{
	str=w[i]+str;
	str=str1+str;
	}
	System.out.println("MODIFIED STRING OF WORDS : \n ");
System.out.println(str);
System.out.println("D22DCE159");
}

}
