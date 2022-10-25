import java.util.Scanner;
import java.util.*;
public class P1
{
    public static void main(String[] args) {
    int x,y;
    try {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of the x: ");
        x=sc.nextInt();
        System.out.print("Enter Value of the y: ");
        y=sc.nextInt();
        System.out.println("Answer is : " + x/y);
    } 
    catch (ArithmeticException a) {
       		 System.out.println("you cannot divide the number by the Zero");
    }
    catch(InputMismatchException b){
        System.out.println("you cannot enter the floating number");
    }
    System.out.println("MANN PATEL D22DCE159");	
    }	
}
