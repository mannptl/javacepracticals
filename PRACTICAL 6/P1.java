import java.io.*;
import java.io.File;
import java.util.*;
public class P1 {
 public static void main(String args[]) {
 int x;
 for (x = 0; x < args.length; x++) {
 int y = 0;
 try {
 File fileobj = new File(args[x]);
 if (fileobj.exists()) {
 System.out.println("Searching For " + args[x] + "....");
 System.out.println(args[x] + "Found.");
 }
 Scanner sc = new Scanner(fileobj);
 while (sc.hasNextLine()) {
 y++;
 sc.nextLine();
 }
 System.out.println(
 "They are " + y + "lines in" + fileobj.getName() + "\n"
 );
 sc.close();
 } catch (IOException e) {
 System.out.println("An Error occured While Finding" + args[x] + "file");
 e.printStackTrace();
 }
 }
 System.out.println("MANN PATEL D22DCE159 ");
 }
}