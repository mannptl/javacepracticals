import java.io.*;
class P3 {
 public static void main(String a[]) throws IOException {
 File f1 = new File("FILE1.txt");
 String[] words = null;
 FileReader fr = new FileReader(f1);
 BufferedReader br = new BufferedReader(fr);
 String s;
 String input = "HELLO";
 int count = 0;
 while ((s = br.readLine()) != null) {
 words = s.split(" ");
 for (String word : words) {
 if (word.equals(input)) {
 count++;
 }
 }
 }
 if (count != 0) { //check count not equal to zero
 System.out.println(
 "The given word is present for " + count + " times in the file"
 );
 } else {
 System.out.println("The given word is not present in the file");
 }
 System.out.println("MANN PATEL D22DCE159");
 }
}