import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class P5_2{
 public static void main(String[] args) {
 try{
 FileReader fr= new FileReader("FILE1.txt");
 BufferedReader br= new BufferedReader(fr);
 String line="";
 while((line=br.readLine())!=null){
 System.out.println(line);
 }
 }
 catch(IOException e){
 e.printStackTrace();
 }
System.out.println("MANN PATEL D22DCE159");
 }
}