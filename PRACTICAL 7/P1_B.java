import java.lang.*;
public class P1_B implements Runnable
{
    public void run()
    {
    System.out.println("Hello!! D22DCE159");
    }
    public static void main(String a[])
    {
        P1_B t=new P1_B();
        Thread th=new Thread(t);
        th.start();
    }
}
    