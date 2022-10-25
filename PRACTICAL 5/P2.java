import java.util.*;
public class P2
{
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
Scanner sc=new Scanner (System.in);
try{
try{
int x=10/0;
}
catch(ArithmeticException e)
{
System.out.println("Invalid division");
}
try{
System.out.println("Enter an integer:");
int y=s.nextInt();
s.close();
}
catch(InputMismatchException e)
{
System.out.println("Index is Invalid");
}
try{
System.out.println("Enter a String:");
String z=sc.nextLine();
sc.close();
}
catch(InputMismatchException e)
{
System.out.println("Index is Invalid");
}
try{
int w[]=new int[5];
System.out.println(w[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index is Invalid");
}
}catch(Exception e)
{
System.out.println("Exception Encountered.");
}
finally
{
System.out.println("Exception Handling Completed");
}
System.out.println("MANN PATEL D22DCE159");
}
}

