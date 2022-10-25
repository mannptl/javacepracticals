import java.lang.*;
class P5 extends Thread
{
public static void main(String a[])
{
P5 FIRST = new P5();
P5 SECOND = new P5();
P5 THIRD = new P5();
System.out.println("Current priority : ");
System.out.println("FIRST thread : " + FIRST.getPriority());
System.out.println("SECOND thread : " + SECOND.getPriority());
System.out.println("THIRD thread : " + THIRD.getPriority());
FIRST.setPriority(3);
SECOND.setPriority(5);
THIRD.setPriority(7);
System.out.println("After setting priority :");
System.out.println("FIRST thread : " + FIRST.getPriority());
System.out.println("SECOND thread : " + SECOND.getPriority());
System.out.println("THIRD thread : " + THIRD.getPriority());
}
}
