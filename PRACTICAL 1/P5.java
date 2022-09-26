import java.util.*;

public class P5 {
    
    public static void main(String[] args) {
        System.out.println("Code 1 for Motor");
        System.out.println("Code 2 for Fan");
        System.out.println("Code 3 for Tube");
        System.out.println("Code 4 for Wires");
        System.out.println("Code 5 for All other");
        Scanner s = new Scanner(System.in);
        int n[] = new int[5];
        n[0] = 1200;
        n[1] = 230;
        n[2] = 100;
        n[3] = 1200;
        n[4] = 320; 
        int b;
        for (int i = 0; i < 6; i++) {
            b = s.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Motor Price = " + n[0]);

                    break;
                case 2:
                    System.out.println("Fan Price = " + n[1]);

                    break;
                case 3:
                    System.out.println("Tube Light Price = " + n[2]);

                    break;
                case 4:
                    System.out.println("Wires Price = " + n[3]);
                    break;
                case 5:
                    System.out.println("All other Price = " + n[4]);
                    break;
                case 6:
                    float sum = ((n[0] * (8 / 100) + n[0]) + (n[1] * (12 / 100) + n[1]) + (n[2] * (5 / 100) + n[2])
                            + (float) (n[3] * (7.5 / 100) + n[3]) + (n[4] * (3 / 100) + n[4]));
                    System.out.println("Total Bill is :" + sum);
            }
        }
        System.out.println("D22DCE159 MANN PATEL");
	
        s.close();
    }
}
