import java.util.*;
public class P7
{
    private void methodOverloaded()
    {
    System.out.println("No arg.");
    }
    private int methodOverloaded(int i)
    {
    System.out.println("This is int. value is: " + i);
    return 0;
    }

    
    protected int methodOverloaded(double d)
    {
    System.out.println("This is double. value is: " + d);
    return 0;
    
    }
    
    public void methodOverloaded(int i, double d)
    {
    System.out.println("int :" + i + "double :" + d);
    }
    
        
    public  static void main(String [] args)
    {
    
        P7 m1= new P7(); 
        m1.methodOverloaded();
        m1.methodOverloaded(2);
        m1.methodOverloaded(12345.67);
        m1.methodOverloaded(5,12345.67);
    }
}
