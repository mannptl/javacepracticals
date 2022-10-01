import java.io.*;
import java.util.*;

public class P6P3
{
    public static void main (String args[])
    {  
        int i,j,k;
        for ( i = 0; i < 5; i++)
        {
            for (int y = i; y <5 ; y++)
            {
                System.out.print(" ");
            }

            for(k=0;k<=i ; k++)
            {
                System.out.print("* ");	
            }

            System.out.println();
        }
    }
}
