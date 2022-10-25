import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class P3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the file path: ");
File file = new File(scanner.next());
if (!file.isFile()) {
System.out.println(file + " is not a file.");
}
String[] words;
try (BufferedReader in = new BufferedReader(new FileReader(file))) {
StringBuilder buffer = new StringBuilder(10000);
String s;
while ((s = in.readLine()) != null) buffer.append(s).append("\n");
words = buffer.toString().split("[0-9]+|\\W+");
} catch (IOException ex) {
words = new String[1];
System.out.println("Error opening file...");
System.exit(0);
}
// Create a TreeMap to hold words as key and count as value
final Map<String, Integer> map = new TreeMap<>();
for (String word1 : words) {
    String key = word1.toLowerCase();
    if (key.length() > 0) {
    if (!map.containsKey(key)) {
    map.put(key, 1);
    } else {
    int value = map.get(key);
    value++;
    map.put(key, value);
    }
    }
    }
    // Display key and value for each entry
    map.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
    }
    