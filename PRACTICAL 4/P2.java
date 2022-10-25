import java.util.*;
class Member
{
    String name;
    int age;
    long ph_no;
    String address;
    float salary;
    void print_salary(){
    System.out.println(salary);
    }
}
class Employee extends Member
{
    String specialization;
    String department;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.print("Enter name of employee : ");
        name=sc.nextLine();
        System.out.print("Enter age of employee  : ");
        age=sc.nextInt();
        System.out.print("Enter ph_no of employee  : ");
        ph_no=sc.nextLong();
           sc.nextLine();
        System.out.print("Enter address of employee  : ");
        address=sc.nextLine();
        System.out.print("Enter salary of employee  : ");
        salary=sc.nextFloat();
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(ph_no);
        System.out.println(address);
        System.out.println(salary);
    }
}
class Manager extends Member
{
    String specialization;
    String department;
    Scanner sc=new Scanner(System.in);
    Manager(){
        System.out.print("Enter name of manager : ");
        name=sc.nextLine();
        System.out.print("Enter age of manager  : ");
        age=sc.nextInt();
       System.out.print("Enter ph_no of manager  : ");
        ph_no=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter address of manager  : ");
        address=sc.nextLine();
        System.out.print("Enter salary of manager  : ");
        salary=sc.nextFloat();
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(ph_no);
        System.out.println(address);
        System.out.println(salary);
    }
}
class P2
{
    public static void main(String args[]){
        Employee emp=new Employee();
        Manager mng=new Manager();
           System.out.println("MANN PATEL D22DCE159 ");
    }
}
