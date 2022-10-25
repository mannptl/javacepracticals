import java.lang.Thread;
import java.util.Scanner;
public class P4 extends Thread {
 public void run() {
 int x;
 System.out.print("Enter a variable value = ");
 Scanner sc = new Scanner(System.in);
 x = sc.nextInt();
 x++;
 try {
 Thread.sleep(1000);
 System.out.println("After increment : " + x);
 } catch (Exception e) {
 System.out.println(e);
 } }
 public static void main(String a[]) {
 P4 t = new P4();
 t.start();
 System.out.println("MANN PATEL D22DCE159");
 }
}