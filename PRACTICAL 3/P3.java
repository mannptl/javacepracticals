class Employee
{
			String fname;
			String lname;
			double salary;
			
				Employee()
					{
					fname = "";
					lname = "";
					salary = 0.0;
					} 
					
			Employee(String a,String b,double c)
				{
				fname = a;
				lname = b;
				if(c>0)
				   {
				   salary = c;
				   }
				}
				
			String get_fname()
			{
			return fname;
			} 
			
			String get_lname()
			{
			return lname;
			}
			
			double get_salary()
			{
			return salary;
			}
			
			void set_fname(String a) 
			{
			fname = a;
			}
			
			void set_lname(String b)
			{
			lname = b;
			}
			
			void set_salary(double c)
			{
			salary = c;
			} 
			
			void display()
			{
			System.out.println("FIRST NAME: " + get_fname());
			System.out.println("LAST NAME: " + get_lname());
			System.out.println("SALARY  : " + get_salary());
			}
			
			void increment(double per)
			{
			 salary = salary + (salary*per)/100;
			}
			
			
	public static void main(String args[])
		  {
			Employee e1 = new Employee("Mann","Patel",100000);
			Employee e2 = new Employee("Patel","Mann",20000);
		  
			e1.display();
			e2.display();
			System.out.println("INCREMENT 10%..");
			e1.increment(10);
			e2.increment(10);
			System.out.println("   ");
			e1.display();
			e2.display();  
			}
	
}
