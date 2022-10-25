import java.util.*;

public class P7
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,p,x;
        s="CHARUSAT University";
        int ln=s.length();
        System.out.println("Length of string is: "+ln);
        char c[]=new char[ln];
        int ln2=ln;
        for(int i=0;i<ln2;i++)
        {
            c[i]=s.charAt(i);
        }
        c[1]='N';
        for(int i=0;i<ln;i++)
        {
            System.out.print(c[i]);
        }
        System.out.println();
        p=s.toUpperCase();
        System.out.println("Upper case: "+p);

        x=s.substring(0,8);
        System.out.println("Extracted string: "+x);
       
	  System.out.println("D22DCE159 MANN PATEL");

    }
}

