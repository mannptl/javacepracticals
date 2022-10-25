import java.util.*;
class P3
{
Scanner sc=new Scanner(System.in);
int check_exception() throws ArithmeticException
{
int x, y, z;
System.out.print("Enter numerator:");
x = sc.nextInt();
System.out.print("Enter denominator:");
y = sc.nextInt();
z = x / y;
return z;
}
public void checkAge(int age)
{
if(age<18)
{
System.out.println("Not eligible for voting.");
}
else
{
System.out.println("Eligible for voting.");
}	}
public static void main(String[] args)
{
P3 obj=new P3();
//throws
try
{
obj.check_exception();
}
catch(ArithmeticException e)
{
System.out.println("Exception occurred.");
}
//throw
int age;
Scanner sc1=new Scanner(System.in);
System.out.print("Enter your age:");
age=sc1.nextInt();
obj.checkAge(age);
System.out.println("D22DCE159 MANN PATEL");
}
}
