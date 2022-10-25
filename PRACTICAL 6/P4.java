import java.io.*;
import java.util.*;
class P4 {
 public static void main(String a[])
 throws FileNotFoundException, IOException {
 Scanner sc = new Scanner(System.in);
 System.out.print("Source file:");
 String sfile = sc.next();
 System.out.print("Destination file:");
 String dfile = sc.next();
 FileReader fin = new FileReader(sfile);
 FileWriter fout = new FileWriter(dfile, true);
 int c;
 while ((c = fin.read()) != -1) {
 fout.write(c);
 }
 System.out.println("Copying Finished...!");
 fin.close();
 fout.close();
 System.out.println("MANN PATEL D22DCE159");
 }
}