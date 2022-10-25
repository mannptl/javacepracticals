import java.util.*;
class P5
{
    	public static void main(String args[]){
        int len,bred,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length :");
        len=sc.nextInt();
        System.out.println("Enter Breath :");
        bred=sc.nextInt();
        Area a1=new Area(len,bred);
        area=a1.returnArea();
        System.out.println("Area of square is: "+area);
        System.out.println("MANN PATEL D22DCE159");
    }
}
class Area
{
    int le,bre;
            Area(){}
            Area(int l,int b)
        {
            le=l;bre=b;
        }
        int returnArea()
        {
            return (le*bre);
        }
}
