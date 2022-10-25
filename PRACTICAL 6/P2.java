import java.io.*;
import java.lang.*;
class P2 {
 public static void main(String a[]) {
 try {
 int i, occurs = 0;
 FileInputStream fis = new FileInputStream("xanadu.txt");
 BufferedInputStream bis = new BufferedInputStream(fis);
 while ((i = bis.read()) != -1) {
 char x = (char) i;
 if (x == a[0].charAt(0)) {
 occurs++;
 }
 }
 System.out.println(
 "Letter " + a[0] + " is repeated " + occurs + " time in the file."
 );
 } catch (Exception e) {
 System.out.println(e);
 }
 System.out.println("MANN PATEL D22DCE159");
 }
}