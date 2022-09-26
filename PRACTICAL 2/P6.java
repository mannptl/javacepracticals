import java.util.Locale;
import java.util.*;

public class P6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("-------------------------------");
		System.out.println("D22DCE159 MANN PATEL");
		System.out.println("-------------------------------");
		System.out.print("Enter the string: ");
		s = sc.nextLine();
		int ln = s.length();
		System.out.println("-------------------------------");
		System.out.println("Length os string is: " + ln);

		String low;
		low = s.toLowerCase();
		System.out.println("-------------------------------");
		System.out.println("LOWER case string: " + low);

		String up;
		up = s.toUpperCase();
		System.out.println("-------------------------------");
		System.out.println("UPPER case string is: " + up);

		int ln2 = ln;

		String b = "";
		char ch;

		for (int i = 0; i < ln; i++) {
			ch = s.charAt(i);
			b = ch + b;
		}
		System.out.println("-------------------------------");
		System.out.println("Reverse string is: " + b);

		char c[] = new char[100];
		for (int i = 0; i < ln2; i++) {
			c[i] = s.charAt(i);

		}
		for (int i = 0; i < ln2; i++) {
			for (int j = i; j < 5; j++) {
				if (c[i] > c[j]) {
					char temp;
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println("-------------------------------");
		System.out.print("Sorted string is: ");
		for (int i = 0 ; i < 100 ; i++) {
			System.out.print(c[i]);
		}
	}

}
