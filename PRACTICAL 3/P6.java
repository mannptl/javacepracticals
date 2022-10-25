import java.util.*;
class P6
{
    public static void main(String args[])
    {
        Complex c1=new Complex();
        Complex c2=new Complex();
        System.out.println("Enter the first number ");
        c1.getr();
        c1.geti();
        System.out.println("-------------------------");
        System.out.println("Enter the second number ");
        c2.getr();
        c2.geti();
        System.out.println("-------------------------");
        c1.sum(c2);
        c1.sub(c2);
        c1.product(c2);
        System.out.println("-------------------------");
        System.out.println("MANN PATEL D22DCE159");
        System.out.println("-------------------------");
    }
}

class Complex
{
    int real,imag;
    Scanner sc=new Scanner(System.in);
    void getr()
    {
        System.out.println("-------------------------");
        System.out.print("enter real: ");
        real=sc.nextInt();
    }
    void geti()
    {
        System.out.print("enter imaginary: ");
        imag=sc.nextInt();
    }
    void sum(Complex c3)
    {
        System.out.println("Real number sum is: "+(c3.real+real));
        System.out.println("-------------------------");
        System.out.println("Imaginary number sum is: "+(c3.imag+imag));
        System.out.println("-------------------------");
    }
    void sub(Complex c3)
    {
        System.out.println("Real number subtraction is: "+(c3.real-real));
        System.out.println("-------------------------");
        System.out.println("Imaginary number subtraction is: "+(c3.imag-imag));
        System.out.println("-------------------------");
    }
    void product(Complex c3)
    {
        int ans=((real*c3.imag)+(c3.real*imag));
        int x=((c3.real*real)+(c3.imag*imag));
        System.out.println("Product of complex number is:"+x+"+"+ans+"i");
    }
}
