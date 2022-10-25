import java.io.*;
public class P5_1
{
 public static void main(String args[]) throws IOException
{
 FileReader fin = new FileReader("FILE1.txt");
 FileWriter fout = new FileWriter("FILE2.txt");
 try
{
 int c;
 while ((c = fin.read()) != -1)
 {
 fout.write(c);
 }
 }
catch(Exception e)
{
System.out.println(e);
}
 fin.close();
 fout.close();
System.out.println("MANN PATEL D22DCE159");
 }
}