import java.util.*;
class adding implements Runnable {
 int a, b;
 public adding(int a, int b) {
 this.a = a;
 this.b = b;
 }
 public void run() {
 add(a, b);
 }
 public void add(int a, int b) {
 int sum = 0;
 synchronized (this) {
 for (int i = a; i <= b; i++) {
 sum += i;
 }
 System.out.println("Sum of " + a + " to " + b + " numbers = " + sum);
 }
 }
}
public class P2 {
    public static void main(String[] args) {
    System.out.println("Enter the start value");
    Scanner sc = new Scanner(System.in);
    int HELL = sc.nextInt();
    System.out.println("Enter the end value");
    Scanner sc1 = new Scanner(System.in);
    int HEAVEN = sc1.nextInt();
    Thread t1 = new Thread(new adding(HELL, HEAVEN));
    t1.start();
    }
   }
   