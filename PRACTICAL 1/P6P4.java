import java.io.*;
import java.util.*;

public class P6P4
{	
    public static void main (String args[])
    {  
        int i,j,k; 
        for ( i = 0; i <= 4; i++)
        {
            for (int space = i; space <= 4; space++)
            {
                System.out.print(" ");
            }

            for(k=0;k<=i ; k++)
            {
                System.out.print( 5-i + " ");                        
            }
            System.out.println();
        }
    }
}
